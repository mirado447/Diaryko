package com.journal.diaryko.controller;

import com.journal.diaryko.repository.model.Tag;
import com.journal.diaryko.service.TagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TagController {
    private final TagService tagService;

    @GetMapping("/tagCategories/{cid}/tags")
    public List<Tag> getTags(@PathVariable String cid){
        return tagService.getTagsByCategoryId(cid);
    }
}
