package com.journal.diaryko.controller;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.service.JournalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
