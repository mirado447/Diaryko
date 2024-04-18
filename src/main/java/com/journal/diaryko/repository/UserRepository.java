package com.journal.diaryko.repository;

import com.journal.diaryko.repository.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    @Query("SELECT u from User u")
    List<User> findAllUser(Pageable pageable);
}
