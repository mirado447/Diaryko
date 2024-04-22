package com.journal.diaryko.repository;

import com.journal.diaryko.repository.model.TagCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagCategoriesRepository extends JpaRepository<TagCategories, String> {
}
