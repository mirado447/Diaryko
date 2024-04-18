package com.journal.diaryko.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "journal")
public class Journal {
    @Id
    private String id_journal;
    private LocalDate create_at;
    private LocalDate update_at;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
