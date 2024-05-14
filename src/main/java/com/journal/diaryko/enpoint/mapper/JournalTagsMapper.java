package com.journal.diaryko.enpoint.mapper;

import com.journal.diaryko.endpoint.rest.model.JournalTags;
import com.journal.diaryko.service.JournalService;
import com.journal.diaryko.service.TagService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JournalTagsMapper {
    private final TagService tagService;
    private final JournalService journalService;
    public JournalTags toRest(com.journal.diaryko.repository.model.JournalTags domain){
        return new JournalTags()
                .id(domain.getId())
                .tagId(domain.getTag().getId())
                .journalEntriesId(domain.getJournal().getId());
    }

    public com.journal.diaryko.repository.model.JournalTags toDomain(JournalTags rest){
        return com.journal.diaryko.repository.model.JournalTags.builder()
                .id(rest.getId())
                .tag(tagService.getById(rest.getTagId()))
                .journal(journalService.getJournalById(rest.getJournalEntriesId()))
                .build();
    }
}
