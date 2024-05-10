package com.journal.diaryko.enpoint.rest.controller;

import com.journal.diaryko.enpoint.mapper.JournalMapper;
import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.service.JournalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class JournalController {
    private final JournalService service;
    private final JournalMapper journalMapper;

    @GetMapping("/users/{userId}/journals")
    public List<com.journal.diaryko.endpoint.rest.model.Journal> getJournalsByUserId(
            @PathVariable String userId,
            @RequestParam int page,
            @RequestParam(value = "page_size") int pageSize){
        PageFromOne pageFromOne = new PageFromOne(page);
        BoundedPageSize boundedPageSize = new BoundedPageSize(pageSize);
        return service.getJournalsByUserId(userId, pageFromOne, boundedPageSize)
                .stream()
                .map(journalMapper::toRest)
                .toList();
    }
    @GetMapping("/users/{uid}/journals/{jid}")
    public com.journal.diaryko.endpoint.rest.model.Journal getJournalById(
            @PathVariable String uid,
            @PathVariable String jid){
        return journalMapper.toRest(service.getJournalByIdAndUserId(uid, jid));
    }
    @PutMapping("/users/{uid}/journals/{jid}")
    public com.journal.diaryko.endpoint.rest.model.Journal crupdateJournal(
            @PathVariable String uid,
            @PathVariable String jid,
            @RequestBody com.journal.diaryko.endpoint.rest.model.Journal journal){
      return journalMapper.toRest(service.saveJournal(uid, jid, journalMapper.toDomain(journal)));
    }
    @DeleteMapping("/users/{uid}/journals/{jid}")
    public com.journal.diaryko.endpoint.rest.model.Journal deleteJournalById(
            @PathVariable String uid,
            @PathVariable String jid){
        return journalMapper.toRest(service.deletejournal(uid, jid));
    }
}
