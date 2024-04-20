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
@Table(name = "tag")
public class Tag {
    @Id
    private String id;
    private String tag_name;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private TagCategories tagCategories;
}
