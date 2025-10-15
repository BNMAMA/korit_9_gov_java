package com.korit.study.ch16.dto;

import com.korit.study.ch16.entity.User;

public class SignupDto {
    private String username;
    private String password;
    private String name;

    public SignupDto(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword()  {
        return password;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "SignupDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

   public User toUser() { //새로운 객체 생성
        return new User(0, username, password, name);
    }
}
