package com.mindsgraph.backend.mindsgraphbackendver1.controllers;

import com.mindsgraph.backend.mindsgraphbackendver1.entities.User;
import com.mindsgraph.backend.mindsgraphbackendver1.repository.UserJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public RestController(UserJpaRepository userJpaRepository) {
        super();
        this.userJpaRepository = userJpaRepository;
    }
    private UserJpaRepository userJpaRepository;

    @GetMapping("/rest-users")
    public List<User> restUsers(){
        return userJpaRepository.findAll();
    }
}
