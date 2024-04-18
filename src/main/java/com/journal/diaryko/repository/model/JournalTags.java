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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "journal_tags")
public class JournalTags {
    @Id
    private String id_journal_tags;

    @ManyToOne
    @JoinColumn(name = "id_journal")
    private Journal journal;

    @ManyToOne
    @JoinColumn(name = "id_tag")
    private Tag tag;
}
