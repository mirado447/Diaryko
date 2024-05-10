package com.journal.diaryko.enpoint.mapper;

import com.journal.diaryko.repository.model.Journal;
import com.journal.diaryko.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JournalMapper {
    private final UserService userService;
    public com.journal.diaryko.endpoint.rest.model.Journal toRest(Journal domain){
        return new com.journal.diaryko.endpoint.rest.model.Journal()
                .id(domain.getId())
                .createAt(domain.getCreate_at())
                .updateAt(domain.getUpdate_at())
                .title(domain.getTitle())
                .content(domain.getContent())
                .idUser(domain.getUser().getId());
    }

    public Journal toDomain(com.journal.diaryko.endpoint.rest.model.Journal rest){
        return Journal.builder()
                .id(rest.getId())
                .create_at(rest.getCreateAt())
                .update_at(rest.getUpdateAt())
                .title(rest.getTitle())
                .content(rest.getContent())
                .user(userService.getUserById(rest.getIdUser()))  //TODO: verify if it's a good practice
                .build();
    }
}
