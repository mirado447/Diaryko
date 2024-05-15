package com.journal.diaryko.service;

import com.journal.diaryko.model.exception.NotFoundException;
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

    public Tag getByIdAndCategoryId(String tid, String cid){
        TagCategories categories = categoriesService.getCategoryById(cid);
        Tag tag = repository.findByIdAndTagCategoriesId(tid, categories.getId());
        if (tag != null){
            return tag;
        }else{
            throw new NotFoundException("Tag with id " + tid + ", in category id " + cid + " not found");
        }
    }

    public Tag getById(String tid){
        return repository
                .findById(tid)
                .orElseThrow(() -> new NotFoundException("Tag with id " + tid + " not found"));
    }
}
