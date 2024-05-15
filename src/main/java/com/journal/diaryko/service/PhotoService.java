package com.journal.diaryko.service;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.repository.PhotoRepository;
import com.journal.diaryko.repository.model.Photo;
import com.journal.diaryko.repository.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PhotoService {
    private final PhotoRepository repository;
    private final UserService userService;
    public List<Photo> getPhotosByUserId(String uid, PageFromOne page, BoundedPageSize pageSize){
        Pageable pageable = PageRequest.of(page.getValue() - 1, pageSize.getValue());
        User user = userService.getUserById(uid);
        return repository.findAllByUserId(user.getId(), pageable);
    }
}
