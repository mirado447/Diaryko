package com.journal.diaryko.repository;

import com.journal.diaryko.repository.model.Journal;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JournalRepository extends JpaRepository<Journal, String> {
    List<Journal> findAllByUserId(String uid, Pageable pageable);

    Journal findByIdAndUserId(String jid, String uid);
}
