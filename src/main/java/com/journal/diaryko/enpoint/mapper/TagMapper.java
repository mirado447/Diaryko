package com.journal.diaryko.enpoint.mapper;

import com.journal.diaryko.repository.model.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TagMapper {
    public com.journal.diaryko.endpoint.rest.model.Tag toRest(Tag domain){
        return new com.journal.diaryko.endpoint.rest.model.Tag()
                .id(domain.getId())
                .tagName(domain.getTag_name());
    }
}
