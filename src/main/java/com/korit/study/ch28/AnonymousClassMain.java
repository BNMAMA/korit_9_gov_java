package com.korit.study.ch28;

import java.util.concurrent.atomic.AtomicInteger;

public class AnonymousClassMain { //anonymous 랑 atomic이랑 세트
    public static void main(String[] args) {
        AnonymousClass a = new AnonymousClassImpl();
        a.fx1();
        System.out.println(a.fx2());

        int num = 10;
        AtomicInteger num2 = new AtomicInteger(10);

        AnonymousClass b = new AnonymousClass() {
                                            //클래스명 생략
            //innerClass는 클래스 안에 클래스 생성 가능
            //------------메소드 안에 클래스 생성 불가능
            //atomic 동시성 방지 -> locking(다른 애들은 wait)
            //익명 클래스 메소드 처럼 사용 가능
            @Override
            public void fx1() {
                System.out.println(num);
                num2.set(num2.get() + 10);
                //호출이 끝나야 다음으로 넘어감
            }

            @Override
            public int fx2() {
                return 0;
            }
        };
    }
}
