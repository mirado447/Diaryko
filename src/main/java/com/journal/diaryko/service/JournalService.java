package com.journal.diaryko.service;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.model.exception.NotFoundException;
import com.journal.diaryko.repository.JournalRepository;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.repository.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class JournalService {

    private final JournalRepository journalRepository;
    private final UserService userService;

    public List<Journal> getJournalsByUserId(String uid, PageFromOne page, BoundedPageSize boundedPageSize){
        User user = userService.getUserById(uid);
        Pageable pageable = PageRequest.of(page.getValue() - 1, boundedPageSize.getValue());
        return journalRepository.findAllByUserId(user.getId(), pageable);
    }

    public Journal getJournalByIdAndUserId(String uid, String jid){
        User user = userService.getUserById(uid);
        Journal journal = journalRepository.findByIdAndUserId(jid, user.getId());
        if(journal != null){
            return journal;
        }else{
            throw new NotFoundException("Journal with id " + jid + ", for user with id " + uid + " not found");
        }
    }

    public Journal saveJournal(String uid, String jid, Journal journal){
        User user = userService.getUserById(uid);
        Journal journalToUpdate = journalRepository.findByIdAndUserId(jid, user.getId());
        if (journalToUpdate != null){
            journalToUpdate.setUpdate_at(LocalDate.now());
            journalToUpdate.setTitle(journal.getTitle());
            journalToUpdate.setContent(journal.getContent());
            return journalRepository.save(journalToUpdate);
        }else {
            journal.setCreate_at(LocalDate.now());
            journal.setUpdate_at(LocalDate.now());
            return journalRepository.save(journal);
        }
    }

    public Journal deletejournal(String uid, String jid){
        User user = userService.getUserById(uid);
        Journal journal = journalRepository.findByIdAndUserId(jid, user.getId());
        if(journal != null){
            journalRepository.delete(journal);
        }else{
            throw new NotFoundException("Journal with id " + jid + ", for user with id " + uid + " not found");
        }
        return journal;
    }

    public Journal getJournalById(String jid){
        return journalRepository
                .findById(jid)
                .orElseThrow(() -> new NotFoundException("Journal with id " + jid + " not found"));
    }
}
