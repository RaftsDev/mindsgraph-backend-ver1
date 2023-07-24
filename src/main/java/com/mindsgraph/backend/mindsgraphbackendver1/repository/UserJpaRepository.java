package com.mindsgraph.backend.mindsgraphbackendver1.repository;

import com.mindsgraph.backend.mindsgraphbackendver1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<User, Integer> {
    public List<User> findAll();
}