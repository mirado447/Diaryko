package com.journal.diaryko.enpoint.rest.controller;

import com.journal.diaryko.enpoint.mapper.PhotoMapper;
import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.service.PhotoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PhotoController {
    private final PhotoService photoService;
    private final PhotoMapper photoMapper;
    @GetMapping("/users/{uid}/photos")
    public List<com.journal.diaryko.endpoint.rest.model.Photo> getPhotosByUserId(
            @PathVariable String uid,
            @RequestParam int page,
            @RequestParam(value = "page_size") int pageSize){
        PageFromOne pageFromOne = new PageFromOne(page);
        BoundedPageSize boundedPageSize = new BoundedPageSize(pageSize);
        return photoService.getPhotosByUserId(uid, pageFromOne, boundedPageSize)
                .stream()
                .map(photoMapper::toRest)
                .toList();
    }
}
