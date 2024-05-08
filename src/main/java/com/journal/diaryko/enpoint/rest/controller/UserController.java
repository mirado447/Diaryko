package com.journal.diaryko.enpoint.rest.controller;

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

    @GetMapping("/users")
    public List<User> getUsers(
            @RequestParam int page,
            @RequestParam(value = "page_size") int pageSize){  //value = "page_size" is the name of query params in url
        PageFromOne pageFromOne = new PageFromOne(page);
        BoundedPageSize boundedPageSize = new BoundedPageSize(pageSize);
        return service.getAllUser(pageFromOne, boundedPageSize);
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id){
        return service.getUserById(id);
    }

    @PutMapping("/users/{id}")
    public User crupdateUser(
            @PathVariable String id,
            @RequestBody User user){
        return service.saveUser(id, user);
    }
    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable String id){
        return service.deleteUser(id);
    }
}
