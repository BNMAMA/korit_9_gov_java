package com.korit.study.ch26;

import java.util.NavigableMap;

enum Name {
    준일 , 준이, 준삼
}

enum Name2 { //열거형 ( 값이 변하지 않음 - 가져다 쓰는 용도)
    N1("준일"), N2("준이"), N3("준삼");

    private final String value; //보통 상수로 사용

    Name2(String value) { //public 생성자 못씀
        this.value = value;
    }

    public String value() { //변수 쓰기위한 메소드 만들기
        return value;
    }
}

enum Writer {
    W1("김준일", 32), W2("김준이", 33), W3("김준삼", 34);

    private final String fullName;
    private final Integer age;

    Writer(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() { //final이라서 getter만 사용가능
        return fullName;
    }

    public Integer getAge() {
        return age;
    }
}

// enumerated -> 열거, 나열
public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Name.준일);
        System.out.println(Name.준이);
        System.out.println(Name.준삼);
        System.out.println(Name2.N1.value());
        System.out.println(Name2.N2.value());
        System.out.println(Name2.N3);

        System.out.println(Writer.W1.getFullName());
        System.out.println(Writer.W1.getAge());

        Writer writer = Writer.W1;
    }

}
