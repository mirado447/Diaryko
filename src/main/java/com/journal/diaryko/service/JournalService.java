package com.journal.diaryko.service;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.repository.JournalRepository;
import com.journal.diaryko.repository.model.Journal;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JournalService {
    private final JournalRepository repository;
    public List<Journal> getJournalsByUserId(String userId, PageFromOne page, BoundedPageSize boundedPageSize){
        Pageable pageable = PageRequest.of(page.getValue() - 1, boundedPageSize.getValue());
        return repository.findAllByUserId(userId, pageable);
    }
}
