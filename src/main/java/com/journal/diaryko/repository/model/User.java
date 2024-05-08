package com.journal.diaryko.repository.model;

import com.journal.diaryko.model.enums.Sex;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcType;
import org.hibernate.dialect.PostgreSQLEnumJdbcType;

import java.time.LocalDate;
@Data
@Entity // entity in DB, with attributes as column.
@AllArgsConstructor
@NoArgsConstructor
@Builder // creat instance of user.
@Table(name = "\"user\"") // name of table, if not specified the default name will be User.
public class User {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate birthdate;

    @Enumerated(EnumType.STRING) // The value in the column will be string type, not index (ex: 'M' not sex.M)
    @JdbcType(PostgreSQLEnumJdbcType.class)
    private Sex sex;

    private String password;
}
