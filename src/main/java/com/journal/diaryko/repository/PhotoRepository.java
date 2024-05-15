package com.journal.diaryko.repository;

import com.journal.diaryko.repository.model.Photo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, String> {
    @Query("select photo from Photo photo where photo.journal.user.id = :uid")
    List<Photo> findAllByUserId(String uid, Pageable pageable);
    List<Photo> findAllByJournalId(String jid, Pageable pageable);
}
