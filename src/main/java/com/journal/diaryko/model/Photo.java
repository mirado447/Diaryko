package com.journal.diaryko.model;

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
@Table(name = "photo")
public class Photo {
    @Id
    private String id_photo;
    private String name;
    private String type_mime;
    private LocalDate create_at;
    private int file_size;
    private String filepath;

    @ManyToOne
    @JoinColumn(name = "id_journal")
    private Journal journal;
}
