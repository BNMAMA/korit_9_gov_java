package com.korit.study.ch23;

public class GenericMain {
    public static void main(String[] args) {
        NonGeneric a = new NonGeneric("문자열 데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] arr = {a, b, c, d};
        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
            if (n.getData() instanceof String data) {
                                        //지역변수
                System.out.println(data);

            } else if (n.getData() instanceof NonGeneric data) {
                System.out.println(data.getData());
            }


        }

        // 자료형을 세분화 하는 이유
        // 모두 Object(업캐스팅) 시키면 데이터 손실이 생기고 원래의 데이터 타입을 알 수 없다.
        // .getclass (클래스의 원형 클래스가 나온다 (자료형))

        Generic<String, Integer> e = new Generic<String, Integer>("문자열 데이터", "", 3.14, 10);
        // 위 아래 두개 같음
        Generic<String, Integer> f = new Generic<>("문자열 데이터", "", 3.14, 10);

        // int <-> integer 차이점
        // 값 대입 <-> 객체의 값을 참조시킴


        Object[] arr2 = new Object[1];
        // 배열은 자료형들의 묶음이다
        // 배열은 순서대로 이어진 자료 구조이다. (선형 구조)

    }
}
