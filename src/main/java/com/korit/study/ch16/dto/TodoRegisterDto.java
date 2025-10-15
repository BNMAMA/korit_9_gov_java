package com.korit.study.ch16.dto;

import com.korit.study.ch16.entity.Todo;
import com.korit.study.ch16.entity.User;

import java.time.LocalDateTime;

public class TodoRegisterDto {
    private String contents;
    private User user;

    public TodoRegisterDto(String contents, User user) {
        this.contents = contents;
        this.user = user;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "TodoRegisterDto{" +
                "contents='" + contents + '\'' +
                ", user=" + user +
                '}';
    }

   public Todo toTodo() {
        return new Todo(0, contents, user, LocalDateTime.now());
    }
}
