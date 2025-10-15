package com.korit.study.ch09;

import java.sql.SQLOutput;

class Student {
    String name;
    int age;
    boolean gender;

    void printInfo() {
        System.out.println("학생 정보 출력");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + (gender ? "남" : "여"));
    }
}


public class StudentMain {
    public static void main(String[] args) {
        // 2명의 학생정보를 객체를 사용하여 정의하고 출력하는 프로그램을 작성하시오.
    /*
        이름: 김준일
        나이: 32
        성별: 남(true),

        이름: 김준이
        나이: 33
        성별: 여(false)
    */

    Student st = new Student();
        st.name = "김준일";
        st.age = 32;
        st.gender = true;

    Student st1 = new Student();
        st1.name = "김준이";
        st1.age = 33;
        st1.gender = false;

//
//        System.out.printf("""
//                이름: %s
//                나이: %d
//                성별: %b""", st.name, st.age, st.gender);
//
//        System.out.println();
//        System.out.println();
//
//        System.out.printf("""
//                이름: %s
//                나이: %d
//                성별: %b""", st1.name, st1.age, st1.gender);
//
//        System.out.println();
        st.printInfo();
        st1.printInfo();

    }
}
