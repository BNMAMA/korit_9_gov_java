package com.korit.study.ch29;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {
        // 1 . 매개변수 x , 리턴 x

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 인터페이스");
            }
        };

        Runnable runnable2 = () -> {
            System.out.println("runnable 인터페이스");
        };
        runnable2.run();

        // 2. 매개변수 o, 리턴 x
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer 인터페이스");
                System.out.println("매개변수 s: " + s);

            }
        };
        stringConsumer.accept("consumer");

        Consumer<String> stringConsumer2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("consumer 인터페이스");
                System.out.println("매개변수 s: " + s);
            }
        };
        stringConsumer2.accept("consumer");

        Consumer<Integer> andThenStudy = num -> {
            System.out.println("1");
            System.out.println(num);
        };
        Consumer<Integer> andThenStudy2 = andThenStudy.andThen(num2 -> { //andThen(메소드)의 호출 결과를 andThenStudy2에 담는다
            System.out.println("2");
            System.out.println(num2);
        });

        andThenStudy.accept(10);
        andThenStudy2.accept(20);

        Consumer<Double> doubleConsumer = d -> {
            System.out.println("1");
            System.out.println("숫자: " + d);
        };
        doubleConsumer.andThen(d -> {
            System.out.println("2");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("3");
            System.out.println("숫자: " + d);
        }).andThen(d -> {
            System.out.println("4");
            System.out.println("숫자: " + d);
        }).accept(3.14);
        //동일한 값을 가지고 위에서부터 실행.. 실행.. 실행 이어질 때 사용한다


        // 3. 매개변수 x, 리턴 o
        String str = null;
        Supplier<Boolean> booleanSupplier = () -> Objects.isNull(str);
        System.out.println(booleanSupplier.get());

        // 4. 매개변수 o, 리턴 o
    }
}
