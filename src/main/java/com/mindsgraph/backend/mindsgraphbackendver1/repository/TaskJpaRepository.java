package com.mindsgraph.backend.mindsgraphbackendver1.repository;

import com.mindsgraph.backend.mindsgraphbackendver1.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskJpaRepository extends JpaRepository<Task, Long> {
    public List<Task> findAll();
}