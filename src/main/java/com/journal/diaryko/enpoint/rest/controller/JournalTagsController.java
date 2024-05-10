package com.journal.diaryko.enpoint.rest.controller;

import com.journal.diaryko.enpoint.mapper.TagMapper;
import com.journal.diaryko.repository.model.Tag;
import com.journal.diaryko.service.JournalTagsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class JournalTagsController {
    private final JournalTagsService service;
    private final TagMapper tagMapper;

    @GetMapping("/journals/{jid}/tags")
    public List<com.journal.diaryko.endpoint.rest.model.Tag> getTagsByJournalId(@PathVariable String jid){
        return service.getTagsByJournalId(jid)
                .stream()
                .map(tagMapper::toRest)
                .toList();
    }
}
