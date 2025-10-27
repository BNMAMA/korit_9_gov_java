package com.korit.study.ch28;

public class AnonymousClassImpl implements AnonymousClass { //인터페이스를 implements한 클래스만 생성이 가능하다
    @Override
    public void fx1() {
        System.out.println("fx1 호출");
    }

    @Override
    public int fx2() {
        return 10;
    }
}
