package com.journal.diaryko.enpoint.mapper;

import com.journal.diaryko.repository.model.Photo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PhotoMapper {
    public com.journal.diaryko.endpoint.rest.model.Photo toRest(Photo domain){
        return new com.journal.diaryko.endpoint.rest.model.Photo()
                .id(domain.getId())
                .filename(domain.getName())
                .typeMime(domain.getType_mime())
                .fileSize(domain.getFile_size())
                .filepath(domain.getFilepath());
    }
    public Photo toDomain(com.journal.diaryko.endpoint.rest.model.Photo rest){
        return Photo.builder()
                .id(rest.getId())
                .name(rest.getFilename())
                .type_mime(rest.getTypeMime())
                .file_size(rest.getFileSize())
                .filepath(rest.getFilepath())
                .build();
    }
}