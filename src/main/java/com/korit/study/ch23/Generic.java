package com.korit.study.ch23;

public class Generic<T, T2> {
    // 자료형 자체를 변수처럼 바꿔서 사용 가능하게 하는 것 -> generic
    // generic은 무조건 대문자로 작성(한글자로만 ) , 여러 개 가능
    // 대문자는 타입을 나타낸다.
    // T type, RT/R return , E 요소(element)
    // <타입 명시> -> 안하면 Object
    // generic은 무조건 참조 자료형만 사용한다.
    // generic은 생성이 안된다
    // 이미 추상화를 가지고 있음

    private T data;
    private T data2;
    private Double data3;
    private T2 data4;
    private T[] arr;

    public Generic(T data, T data2, Double data3, T2 data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;

    }
}
