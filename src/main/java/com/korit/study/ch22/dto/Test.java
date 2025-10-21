package com.korit.study.ch22.dto;

class Entity {
    private String name;

    public void call() {
        Entity t = new Entity();
        t.name = "김준일";
        System.out.println(t.name);

    }

    public void thisCall() {
        System.out.println(name);
    }
}

// private은 동일한 클래스 파일 내에서만 사용 가능
// (파일 <-> 파일) 관계로 접근지정자 적용
// (같은 클래스 내에 다른 메모리 주소를 가지고 있어도 접근은 가능)

public class Test {
    public static void main(String[] args) {
        Entity e = new Entity();
        e.call();
        e.thisCall();


    }


}
