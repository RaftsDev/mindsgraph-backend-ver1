package com.mindsgraph.backend.mindsgraphbackendver1.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Tasks")
public class Task {
    @Id
    @Column(name = "task_id")
    private long taskId;
    @Column(name = "parent_id")
    private long parentId;

    private String name;

    private String description;

    @Column(name="user_id")
    private long userId;


    //Constructors
    public Task(){
    }

    public Task(long taskId, long parentId, String name, String description, long userId) {
        this.taskId = taskId;
        this.parentId = parentId;
        this.name = name;
        this.description = description;
        this.userId = userId;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                '}';
    }
}
