package com.korit.study.ch23;

import java.util.ArrayList;

public class CollectionMain {
    public static void main(String[] args) {
       // 배열 형태의 리스트
        ArrayList list = new ArrayList();
        list.add(10); // 값을 주입 할 수 있는 메소드
        list.add("20");
        list.add(30.5);
        list.add(true);
        System.out.println(list);
        System.out.println(list.get(0)); //값을 가지고 나오는 메소드(Object 타입을 가지고 나옴)


        ArrayList<String> strList = new ArrayList<>(); //generic으로 String 받음
        strList.add("문자열");
        System.out.println(strList.get(0)); //generic 으로 String 잡아놔서 String만 가능

        test(new ArrayList<>());

    }

    public static void test(ArrayList<String> stringArrayList) {

    }
}
