package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;

public interface SigninService {

    void signin(SigninDto signinDto);

    boolean isEmpty(String string);
}
