package com.journal.diaryko.service;

import com.journal.diaryko.model.exception.ResourceAlreadyExistsException;
import com.journal.diaryko.repository.JournalTagsRepository;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.repository.model.JournalTags;
import com.journal.diaryko.repository.model.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JournalTagsService {
    private final JournalTagsRepository repository;
    private final JournalService journalService;
    private final TagService tagService;

    public List<Tag> getTagsByJournalId(String jid){
        Journal journal = journalService.getJournalById(jid);
        return repository.findAllByJournalId(journal.getId());
    }
    public Tag AddJournalTags(String jid,String tid){
        Journal journal = journalService.getJournalById(jid);
        Tag tag = tagService.getById(tid);
        JournalTags existingJournalTags = repository.findByJournalIdAndTagId(jid, tid);

        if(existingJournalTags != null){
            throw new ResourceAlreadyExistsException("Tag: " + tag.getTag_name() + " is already added to this journal");
        }

        JournalTags journalTags = JournalTags.builder()
                .id(jid + "_" + tag.getId())    //TODO: change the generation id methode
                .tag(tag)
                .journal(journal)
                .build();
        repository.save(journalTags);
        return tag;
    }

    public Tag DeleteJournalTags(String jid, String tid){
        JournalTags journalTags = repository.findByJournalIdAndTagId(jid, tid);
        Tag tag = tagService.getById(tid);
        repository.delete(journalTags);
        return tag;
    }
}
