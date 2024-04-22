package com.journal.diaryko.repository;

import com.journal.diaryko.repository.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, String > {
    List<Tag> findByTagCategoriesId(String cid);
}
