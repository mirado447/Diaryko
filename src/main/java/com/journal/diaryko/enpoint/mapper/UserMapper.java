package com.journal.diaryko.enpoint.mapper;

import com.journal.diaryko.model.enums.Sex;
import com.journal.diaryko.repository.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

import static com.journal.diaryko.service.utils.EnumMapperUtils.mapEnum;
@Component
@AllArgsConstructor
public class UserMapper {
    public com.journal.diaryko.endpoint.rest.model.User toRest(User domain){
        return new com.journal.diaryko.endpoint.rest.model.User()
                .id(domain.getId())
                .firstName(domain.getFirstname())
                .lastName(domain.getLastname())
                .email(domain.getEmail())
                .birthDate(domain.getBirthdate())
                .sex(toRest(domain.getSex()))
                .password(domain.getPassword());
    }

    public User toDomain(com.journal.diaryko.endpoint.rest.model.User rest){
        return User.builder()
                .id(rest.getId())
                .firstname(rest.getFirstName())
                .lastname(rest.getLastName())
                .email(rest.getEmail())
                .birthdate(rest.getBirthDate())
                .sex(toDomain(rest.getSex()))
                .password(rest.getPassword())
                .build();
    }

    public static com.journal.diaryko.endpoint.rest.model.Sex toRest(Sex sex){
        return mapEnum(
                sex, Map.of(
                        Sex.M, com.journal.diaryko.endpoint.rest.model.Sex.M,
                        Sex.F, com.journal.diaryko.endpoint.rest.model.Sex.F,
                        Sex.OTHER, com.journal.diaryko.endpoint.rest.model.Sex.OTHER));
    }

    public static Sex toDomain(com.journal.diaryko.endpoint.rest.model.Sex sex){
        return mapEnum(
                sex, Map.of(
                        com.journal.diaryko.endpoint.rest.model.Sex.M, Sex.M,
                        com.journal.diaryko.endpoint.rest.model.Sex.F, Sex.F,
                        com.journal.diaryko.endpoint.rest.model.Sex.OTHER, Sex.OTHER));
    }}
