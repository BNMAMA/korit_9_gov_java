package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SignupService {
//   싱글톤 만들기
    // 1. instance static 변수 정의
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    } // 생성자를 밖에 호출하지 않게 하기 위해서 private

    public static SignupService getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        if (Objects.isNull(foundUser)) {
            return true;
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        return !Objects.isNull(password) && !password.isBlank();

        //trim 문자열(String) 메소드 -> 양쪽 공백 제거
    }

    public boolean isValidConfirmPassword(String password, String confimPassword) {
        if (Objects.isNull(password) || Objects.isNull(confimPassword)) {
            return false;
        }
        return password.equals(confimPassword);
    }

    public void signup(SignupDto signupDto) {
        User newUser = new User(0, signupDto.getUsername(), signupDto.getPassword());
        userRepository.insert(signupDto.toUser()); //새로운 유저 추가
    }


}
