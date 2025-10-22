package com.korit.study.ch23;

public class StaticGeneric { //<T> - 생성이 될 때 사용함
    public static <T> void print(T data) {
        System.out.println(data);
    }


    public static <T extends String> void print(T data) { // static과 제네릭을 같으 쓰면 static 뒤에 쓴다.
        //print 메소드가 호출 될 때 타입 확인하고 -> 타입을 지정
        System.out.println(data);
    }
}
