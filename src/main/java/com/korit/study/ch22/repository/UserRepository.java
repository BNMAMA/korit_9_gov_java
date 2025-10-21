package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository { //변수 -> 정보 보호
    private static UserRepository instance; //private -> 접근을 못하게 막는 역할
    private User[] users;
    private int autoIncrementId ;

    private UserRepository() { //다른 객체에서 생성 못하게 함 -> private
        users = new User[0];
        autoIncrementId = 1;
    }

    public static UserRepository getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepository();
        }
        return instance;
    }

    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        user.setId(autoIncrementId++);
        temp[temp.length - 1] = user;
        users = temp;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private int generateId() {
        return users[users.length].getId() + 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); //문자열을 계속 더할 때 효과적임
        stringBuilder.append("User 배열: [");
        for (int i = 0; i < users.length; i++) {
            stringBuilder.append(users[i]); //toString 생략
            if (i == users.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
