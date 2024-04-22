package com.journal.diaryko.service;

import com.journal.diaryko.repository.TagRepository;
import com.journal.diaryko.repository.model.Tag;
import com.journal.diaryko.repository.model.TagCategories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TagService {
    private final TagRepository repository;
    private final TagCategoriesService categoriesService;

    public List<Tag> getTagsByCategoryId(String cid){
        TagCategories categories = categoriesService.getCategoryById(cid);
        return repository.findByTagCategoriesId(categories.getId());
    }
}
