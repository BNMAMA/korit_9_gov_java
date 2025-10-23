package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.ArrayList;
import java.util.Objects;

public class UserRepositoryImpl implements UserRepository{ //변수 -> 정보 보호
    private static UserRepositoryImpl instance; //private -> 접근을 못하게 막는 역할
    ArrayList <User> users;
//    private int autoIncrementId ;

    private UserRepositoryImpl() { //다른 객체에서 생성 못하게 함 -> private
        users = new ArrayList<>();
//        autoIncrementId = 1;
    }

    public static UserRepositoryImpl getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    public void insert(User user) {
//        User[] temp = Arrays.copyOf(users, users.length + 1);
//        user.setId(autoIncrementId++);
//        temp[temp.length - 1] = user;
//        users = temp;
        users.add(user);

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
//        return users[users.length].getId() + 1;
        return users.size() + 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); //문자열을 계속 더할 때 효과적임
        stringBuilder.append("User 배열: [");
        for (int i = 0; i < users.size(); i++) {
            stringBuilder.append(users.get(i)); //toString 생략
            if (i == users.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
