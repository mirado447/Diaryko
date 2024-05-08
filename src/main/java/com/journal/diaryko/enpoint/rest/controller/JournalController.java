package com.journal.diaryko.enpoint.rest.controller;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.service.JournalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class JournalController {
    private final JournalService service;

    @GetMapping("/users/{userId}/journals")
    public List<Journal> getJournalsByUserId(
            @PathVariable String userId,
            @RequestParam int page,
            @RequestParam(value = "page_size") int pageSize){
        PageFromOne pageFromOne = new PageFromOne(page);
        BoundedPageSize boundedPageSize = new BoundedPageSize(pageSize);
        return service.getJournalsByUserId(userId, pageFromOne, boundedPageSize);
    }
    @GetMapping("/users/{uid}/journals/{jid}")
    public Journal getJournalById(
            @PathVariable String uid,
            @PathVariable String jid){
        return service.getJournalByIdAndUserId(uid, jid);
    }
    @PutMapping("/users/{uid}/journals/{jid}")
    public Journal crupdateJournal(
            @PathVariable String uid,
            @PathVariable String jid,
            @RequestBody Journal journal){
      return service.saveJournal(uid, jid, journal);
    }
    @DeleteMapping("/users/{uid}/journals/{jid}")
    public Journal deleteJournalById(
            @PathVariable String uid,
            @PathVariable String jid){
        return service.deletejournal(uid, jid);
    }
}
