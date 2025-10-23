package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;

import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.repository.UserRepositoryImpl;
import com.korit.study.ch22.repository.UserRepositoryImpl2;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SigninServiceImpl implements SigninService {
    //싱글톤으로 만들것
    private static SigninServiceImpl instance; //static -> 변수명 instance로
    private UserRepository userRepository;

    public SigninServiceImpl(UserRepository userRepository) { //생성자 만들어서 userrepository 가지고 옴
        this.userRepository = userRepository;
    }

    public static SigninServiceImpl getInstance() { //위 변수를 private로 잡았으므로 다른 객체에서 쓰기 위해 getInstance 함수 만듦
        if (Objects.isNull(instance)) {
            instance = new SigninServiceImpl(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    @Override
    public void signin(SigninDto signinDto) {
        User foundUser = userRepository.findByUsername(signinDto.getUsername());
        //userRepository에서 함수 find~ 를 사용하여 User객체(정확히는 이름)가 있는지 확인
        //userRepository에서 함수를 활용하여 signinDtod에 있는 username을 가지고 온다


        //로그인을 시도한 사용자이름 확인 userRepository를 통해서
        //해당 사용자 이름을 가진 User객체가 있는지 확인
        //객체가 null이면 함수 탈출(사용자 정보를 다시 확인하세요)

        if (Objects.isNull(foundUser)) { //사용자 정보 확인
            System.out.println("사용자 정보를 다시 확인하세요");
            return;
        }

        if (!PasswordEncoder.match(signinDto.getPassword(), foundUser.getPassword())) {
            System.out.println("사용자 정보를 다시 확인하세요");
            return;
        }
        System.out.println("로그인 성공");
        System.out.println(foundUser);




        //비밀번호 일치 확인
        //비밀번호가 일치하지 않으면 함수 탈출

        //로그인 성공 -> 로그인 성공한 User객체 toString으로 출력


    }

    @Override
    public boolean isEmpty(String str){
        // username, password가 각각 공백이 아닌지 확인용도
        if (Objects.isNull(str)) {
            return false;
        }
        return str.isBlank();
        //isBlank는 비어있거나 공백일 때 true
    }
}





