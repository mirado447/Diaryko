package com.journal.diaryko.service;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.model.exception.NotFoundException;
import com.journal.diaryko.repository.JournalRepository;
import com.journal.diaryko.repository.UserRepository;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.repository.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JournalService {

    private final JournalRepository journalRepository;
    private final UserRepository userRepository;
    public List<Journal> getJournalsByUserId(String userId, PageFromOne page, BoundedPageSize boundedPageSize){
        User user = userRepository
                .findById(userId)
                .orElseThrow(() -> new NotFoundException("User with id " + userId + " not found"));
        Pageable pageable = PageRequest.of(page.getValue() - 1, boundedPageSize.getValue());
        return journalRepository.findAllByUserId(user.getId(), pageable);
    }
}
