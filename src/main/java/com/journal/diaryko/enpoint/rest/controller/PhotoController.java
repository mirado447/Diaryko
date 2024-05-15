package com.journal.diaryko.enpoint.rest.controller;

import com.journal.diaryko.enpoint.mapper.PhotoMapper;
import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.service.PhotoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/journals/{jid}/photos")
    public List<com.journal.diaryko.endpoint.rest.model.Photo> getPhotosByJournalId(
            @PathVariable String jid,
            @RequestParam int page,
            @RequestParam(value = "page_size") int pageSize){
        PageFromOne pageFromOne = new PageFromOne(page);
        BoundedPageSize boundedPageSize = new BoundedPageSize(pageSize);
        return photoService.getPhotosByJournalId(jid, pageFromOne, boundedPageSize)
                .stream()
                .map(photoMapper::toRest)
                .toList();
    }
    @PostMapping("/journals/{jid}/photos")
    public com.journal.diaryko.endpoint.rest.model.Photo AddPhoto(
            @PathVariable String jid,
            @RequestBody com.journal.diaryko.endpoint.rest.model.Photo photo){
        return photoMapper.toRest(photoService.AddPhoto(jid, photoMapper.toDomain(photo)));
    }
    @GetMapping("/journals/{jid}/photos/{pid}")
    public com.journal.diaryko.endpoint.rest.model.Photo getByIdAndJournalId(
            @PathVariable String jid,
            @PathVariable String pid){
        return photoMapper.toRest(photoService.getPhotoByIdAndJournalId(jid, pid));
    }
    @DeleteMapping("/journals/{jid}/photos/{pid}")
    public com.journal.diaryko.endpoint.rest.model.Photo deletePhoto(
            @PathVariable String jid,
            @PathVariable String pid){
        return photoMapper.toRest(photoService.deletePhoto(jid, pid));
    }
}
