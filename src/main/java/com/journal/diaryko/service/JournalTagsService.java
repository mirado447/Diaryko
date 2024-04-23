package com.journal.diaryko.service;

import com.journal.diaryko.repository.JournalTagsRepository;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.repository.model.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JournalTagsService {
    private final JournalTagsRepository repository;
    private final JournalService journalService;

    public List<Tag> getTagsByJournalId(String jid){
        Journal journal = journalService.getJournalById(jid);
        return repository.findAllByJournalId(journal.getId());
    }
}
