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
@Table(name = "audio")
public class Audio {
    @Id
    private String id;
    private String name;
    private String type_mime;
    private LocalDate create_at;
    private int file_size;
    private String filepath;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "id_journal")
    private Journal journal;
}
