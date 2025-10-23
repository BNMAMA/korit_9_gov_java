package com.korit.study.ch24;

import java.io.OutputStream;
import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {

        //collection - 하나로 묶어서 관리하기 쉬움
        //generic - 종류별로 묶어서 분류하기 쉬움


         //Map<K, V>  K , V -> 엔트리
        // K V 한쌍으로 묶으면 그냥 set<E>이랑 동일

        //문자열을 담을 수 있는 ArrayList 생성
        List <String> list = new ArrayList<>(); //ArrayList가 생성이 가능하다? -> 클래스다

        //값을 추가
        list.add("문자열 값1");
        list.add("문자열 값2");

        //값을 가져오기(인덱스)
        String str1 = list.get(0);
        String str2 = list.get(1);

        // 값을 수정
        String str3 = list.set(1, "문자열 값3"); //바뀔 인덱스, value
        System.out.println(str3);

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

        //Set(집합) 중복 제거 필수, 인덱스 번호 없음
        Set<String> strSet = new HashSet<>(); //Hash - 정렬기준으로 만들어줌(키로 값을 바로 찾아감)

        //값 추가
        strSet.add("가");
        strSet.add("다");
        strSet.add("나");
        System.out.println(strSet); //해쉬 값에 의해서 자동으로 순서대로 출력

        //값 조회 (순서가 없어서 for 문 사용 불가) - set은 무조건 전체 조회해서 값을 가지고 온다.
        String r1 = null;
        String setSearchValue = "다";

        for (String s : strSet) {
            if (s.equals("다")) {
                r1 = s;
                break;
            }
        }
        // 둘 다 사용 가능(단일값)

        System.out.println(r1);
        if (strSet.contains(setSearchValue)) {
            r1 = setSearchValue;
        }
        System.out.println(r1);


        //값 삭제
        strSet.remove("나");
        System.out.println(strSet);

        //값 수정(set은 수정이 아니라 지운다는 개념)
        strSet.remove("다");
        strSet.add("라");
        System.out.println(strSet);

        //리스트(list) -> 세트(set)
        List<String> a = new ArrayList<>();
        a.add("가");
        a.add("가");
        a.add("나");
        a.add("나");
        a.add("다");
        a.add("라");
        a.add("라");

        Set<String> b = new HashSet<>();
        for (String s : a) { // = .addAll() 메소드랑 같음
            b.add(s);
        }
        System.out.println(b);
        Set<String> c = new HashSet<>();
        c.addAll(a);
        System.out.println(c);

        // 세트(set) -> 리스트(list)
        List<String> d = new ArrayList<>();
        // .add(index, element) -> 값을 삽입하고 뒤로 밀리는 개념
        // .add(String) -> 맨 뒤에 추가
        d.addAll(c);

        // Map( 키 + 값 쌍 -> 집합)
        Map<String, String> strMap = new HashMap<>();

        // 값 추가
        strMap.put("a", "김준일");
        strMap.put("b", "김준이");
        strMap.put("c", "김준삼");
        strMap.put("d", "김준사");
        strMap.put("d", "김준오");
        // 동일한 키 값을 가지고 있으면 뒤에 put한 키를 덮어쓴다(수정하는 행위랑 같음)
        // 키 값 중복 불가
        System.out.println(strMap);

        // 값 조회
        String mapValue = strMap.get("c");
        System.out.println(mapValue);
        String mapValue2 = strMap.getOrDefault("g", "기본값");
        System.out.println(mapValue2);


        // 값 수정
        strMap.put("a", "김준육");
        System.out.println(strMap.remove("a"));
        System.out.println(strMap.remove("a"));
        System.out.println(strMap);
        System.out.println(strMap.remove("b", "김준육"));
        System.out.println(strMap.remove("b", "김준이"));
        System.out.println(strMap);
        System.out.println(strMap.entrySet());

        //Map을 반복 작업 하는 방법: Map 자료형을 Entry가 들어있는 Set자료형으로 형 변환
        for (Map.Entry<String, String> entry : strMap.entrySet()) {
            //인터페이스 안에 인터페이스
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

        Set<String> valesSet = new HashSet<>();
        valesSet.addAll(strMap.values());

        // Map {}
        // List []



    }
}
