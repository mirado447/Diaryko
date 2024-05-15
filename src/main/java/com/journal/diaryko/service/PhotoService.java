package com.journal.diaryko.service;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.model.exception.NotFoundException;
import com.journal.diaryko.repository.PhotoRepository;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.repository.model.Photo;
import com.journal.diaryko.repository.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class PhotoService {
    private final PhotoRepository repository;
    private final UserService userService;
    private final JournalService journalService;
    public List<Photo> getPhotosByUserId(String uid, PageFromOne page, BoundedPageSize pageSize){
        Pageable pageable = PageRequest.of(page.getValue() - 1, pageSize.getValue());
        User user = userService.getUserById(uid);
        return repository.findAllByUserId(user.getId(), pageable);
    }
    public List<Photo> getPhotosByJournalId(String jid, PageFromOne page, BoundedPageSize pageSize){
        Pageable pageable = PageRequest.of(page.getValue() - 1, pageSize.getValue());
        Journal journal = journalService.getJournalById(jid);
        return repository.findAllByJournalId(journal.getId(), pageable);
    }
    public Photo AddPhoto(String jid, Photo photo){
        Journal journal = journalService.getJournalById(jid);
        photo.setCreate_at(LocalDate.now());
        photo.setJournal(journal);
        return repository.save(photo);
    }
    public Photo getPhotoByIdAndJournalId(String jid, String pid){
        Journal journal = journalService.getJournalById(jid);
        Photo photo = repository.findByIdAndJournalId(pid, journal.getId());
        if(photo != null){
            return photo;
        }
        throw new NotFoundException("Photo with id " + pid + ", in journal id " + jid + " not found");
    }
}
