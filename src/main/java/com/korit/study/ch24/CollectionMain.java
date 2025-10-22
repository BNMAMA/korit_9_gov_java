package com.korit.study.ch24;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
         //Map<K, V>  K , V -> 엔트리
        // K V 한쌍으로 묶으면 그냥 set<E>이랑 동일

        //문자열을 담을 수 있는 ArrayList 생성
        List<String> list = new ArrayList<>(); //ArrayList가 생성이 가능하다? -> 클래스다

        //값을 추가
        list.add("문자열 값1");
        list.add("문자열 값2");

        //값을 가져오기(인덱스)
        String str1 = list.get(0);
        String str2 = list.get(1);

        // 값을 수정
        String str3 = list.set(1, "문자열 값3");
        System.out.println(list);

        // 값 삭제(remove(Object = 특정 값을 입력)
        boolean removed = list.remove("문자열 값1");
        String str4 = list.remove(0);
        System.out.println(removed);
        System.out.println(str4);

        // 리스트의 크기 (사이즈)
        int size = list.size(); // .size() - 전체 데이터의 갯수를 호출함

        // 리스트 안에 값이 포함되어 있는지 확인
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("30");
        list.add("30");

        System.out.println(list.contains("20")); // .contains() - boolean 리턴

        // 리스트 안에서 값이 위치하고 있는 Index를 찾기
        int indexOf30 = list.indexOf("30"); // .indexOf() - 위치 인덱스 리턴 (동일한 값을 가질경우 앞의 값을 가지고 온다)

        indexOf30 = list.lastIndexOf("30"); // .lastIndexOf() - 뒤에서부터 해당 인덱스 찾기


        //중간에 위치하고 있는 데이터 30의 index를 찾기
        int start = list.indexOf("30") + 1;
        indexOf30 = -1;
        for (int i = start; i < list.size(); i++) {
            if (list.get(i).equals("30")) {
                indexOf30 = i;
                break; // 없을 경우 for문에 계속 돌아감
            }
        }
        System.out.println(indexOf30);


        // 리스트 자르기
        List<String> subList = list.subList(list.indexOf("30") + 1, list.size()); // 범위: 0부터 2전 까지
        subList.indexOf("30"); //자르면 맨 앞에 있는 숫자가 인덱스 0번이 됨
        subList.add("40");
        System.out.println(subList); //새로운 ArrayList를 만듦

        LinkedList<String>linkedList = new LinkedList<>();
        linkedList.add("10");
        linkedList.add("20");
        linkedList.add("30");
        linkedList.add("40");
        linkedList.indexOf("30");



    }
}
