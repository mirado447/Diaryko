package com.journal.diaryko.service;

import com.journal.diaryko.model.BoundedPageSize;
import com.journal.diaryko.model.PageFromOne;
import com.journal.diaryko.model.exception.NotFoundException;
import com.journal.diaryko.repository.UserRepository;
import com.journal.diaryko.repository.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
    public List<User> getAllUser(PageFromOne page, BoundedPageSize pageSize){
        Pageable pageable = PageRequest.of(page.getValue() - 1 , pageSize.getValue()); // - 1 because the default number of first page is 0.
        return repository.findAllUser(pageable);
    }

    public User getUserById(String id){
        return repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("User with id " + id + " not found"));
    }

    public User saveUser(String id, User user){
        Optional<User> optionalUser = repository.findById(id);
        if(optionalUser.isPresent()){
            User userFromDomain = optionalUser.get();
            user.setBirthdate(userFromDomain.getBirthdate());   // Here we save the user with new information and don't touch those who don't need to be changed (since the first save). Instead of changing everything from the old user with the information from the new.
        }
        return repository.save(user);
    }

    public User deleteUser(String id){
        User userToDelete = getUserById(id);
        repository.delete(userToDelete);
        return userToDelete;
    }
}
