package com.journal.diaryko.service;

import com.journal.diaryko.repository.TagCategoriesRepository;
import com.journal.diaryko.repository.model.TagCategories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TagCategoriesService {
    private final TagCategoriesRepository repository;
    public List<TagCategories> getAllTagCategories(){
        return repository.findAll();
    }
}
