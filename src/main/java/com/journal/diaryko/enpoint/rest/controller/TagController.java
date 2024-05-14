package com.journal.diaryko.enpoint.rest.controller;

import com.journal.diaryko.enpoint.mapper.TagMapper;
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
    private final TagMapper tagMapper;

    @GetMapping("/tagCategories/{cid}/tags")
    public List<com.journal.diaryko.endpoint.rest.model.Tag> getTags(@PathVariable String cid){
        return tagService.getTagsByCategoryId(cid)
                .stream()
                .map(tagMapper::toRest)
                .toList();
    }

    @GetMapping("/tagCategories/{cid}/tags/{tid}")
    public com.journal.diaryko.endpoint.rest.model.Tag getTagById(
            @PathVariable String cid,
            @PathVariable String tid){
        return tagMapper.toRest(tagService.getByIdAndCategoryId(tid, cid));
    }
}
