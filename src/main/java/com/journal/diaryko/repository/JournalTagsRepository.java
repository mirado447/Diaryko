package com.journal.diaryko.repository;

import com.journal.diaryko.repository.model.JournalTags;
import com.journal.diaryko.repository.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JournalTagsRepository extends JpaRepository<JournalTags, String> {
    @Query("select jt.tag from JournalTags jt where jt.journal.id = :jid")
    List<Tag> findAllByJournalId(@Param("jid") String jid);
}
