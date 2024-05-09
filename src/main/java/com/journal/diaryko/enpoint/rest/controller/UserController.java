package com.journal.diaryko.enpoint.rest.controller;

import com.journal.diaryko.enpoint.mapper.UserMapper;
import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.repository.model.User;
import com.journal.diaryko.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService service;
    private final UserMapper userMapper;

    @GetMapping("/users")
    public List<com.journal.diaryko.endpoint.rest.model.User> getUsers(
            @RequestParam int page,
            @RequestParam(value = "page_size") int pageSize){  //value = "page_size" is the name of query params in url
        PageFromOne pageFromOne = new PageFromOne(page);
        BoundedPageSize boundedPageSize = new BoundedPageSize(pageSize);
        return service.getAllUser(pageFromOne, boundedPageSize)
                .stream()
                .map(userMapper::toRest)
                .toList();
    }
    @GetMapping("/users/{id}")
    public com.journal.diaryko.endpoint.rest.model.User getUserById(@PathVariable String id){
        return userMapper.toRest(service.getUserById(id));
    }

    @PutMapping("/users/{id}")
    public com.journal.diaryko.endpoint.rest.model.User crupdateUser(
            @PathVariable String id,
            @RequestBody com.journal.diaryko.endpoint.rest.model.User user){
        return userMapper.toRest(service.saveUser(id, userMapper.toDomain(user)));
    }
    @DeleteMapping("/users/{id}")
    public com.journal.diaryko.endpoint.rest.model.User deleteUser(@PathVariable String id){
        return userMapper.toRest(service.deleteUser(id));
    }
}
