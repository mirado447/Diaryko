package com.journal.diaryko.controller;

import com.journal.diaryko.repository.model.TagCategories;
import com.journal.diaryko.service.TagCategoriesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TagCategoriesController {
    private final TagCategoriesService categoriesService;

    @GetMapping("/tagCategories")
    public List<TagCategories> getTagCategories(){return categoriesService.getAllTagCategories();}
}
