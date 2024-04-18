package com.journal.diaryko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Entity // entity in DB, with attributes as column.
@AllArgsConstructor
@NoArgsConstructor
@Builder // creat instance of user.
@Table(name = "\"user\"") // name of table, if not specified the default name will be User.
public class User {
    @Id
    private String id_user;
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate birthdate;
    private String sex ;
    private String password;
}
