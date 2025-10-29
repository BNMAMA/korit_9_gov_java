package com.korit.study.ch29;

import com.korit.study.ch14.UserList;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.*;
import java.util.stream.Collectors;

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

        // forEach()
        List<String> nameList = List.of("김준일", "김준이");
        nameList.forEach(n -> {
                    System.out.println(n);
                    System.out.println(n);
                    System.out.println(n);
                });
                 //forEach interface에서 accept메소드가 매개변수를 하나만 받음

        nameList.forEach(System.out :: println); //더블 콜론 - 람다 메서드 참조


        // 3. 매개변수 x, 리턴 o
        String str = null;
        Supplier<Boolean> booleanSupplier = () -> Objects.isNull(str);
        System.out.println(booleanSupplier.get());

        // 4. 매개변수 o, 리턴 o
        Function<Integer, String> function = num -> {
            System.out.println("정수를 받아서 문자열정수로 리턴");
            return Integer.toString(num);
        };
        String funtionResult = function.apply(10);
        System.out.println(funtionResult);

        Integer funtionResult2 = function
                .andThen(s -> {
                    System.out.println("문자열정수 받아서 실수 자료형으로 리턴");
                    return Double.parseDouble(s);
                })
                .andThen(d -> {
                    System.out.println("실수자료형 바아서 정수로 리턴");
                    return d.intValue();
                })
                .apply(20);

        System.out.println(funtionResult2);

        String funtionResult3 = function
                .compose(d -> {
                    System.out.println("실수자료형을 정소로 리턴");
                    return ((Double) d).intValue();
                })
                .apply(20.5);

        System.out.println(funtionResult3);

        // 5. 매개변수 o, 리턴 boolean
        String searchUsername = "test1234";
        Predicate<List<Map<String, String>>> listPredicate = list -> {
            AtomicBoolean isFound = new AtomicBoolean(false);
            list.forEach(map -> {
                if (map.get("username").equals(searchUsername)) {
                    isFound.set(true);
                }
            });
            return isFound.get();

        };
        List<Map<String, String>> userList = List.of(
                Map.of("username", "test1", "password", "1111"),
                Map.of("username", "test12", "password", "2222"),
                Map.of("username", "test123", "password", "3333"),
                Map.of("username", "test1234", "password", "4444")
        );
        System.out.println(listPredicate.test(userList));

        List<String> names = List.of("김준일", "김준이", "이준일", "이준이");
        String startedLastName = "이";
        List<String> filteringNames = names.stream()
                .filter(name -> name.startsWith(startedLastName))
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(filteringNames);

        String foundName = names.stream().filter(name -> name.equals("김준이"))
                .collect(Collectors.toList())
                .getFirst();
        System.out.println(foundName);

        // 매개변수 o , 리턴 o 둘의 자료형이 동일하면(자료형 하나만 명시한다)
        UnaryOperator<String> f1 = s -> s + "문자열";
        Function<String, String> f2 = s -> s + "문자열";
        UnaryOperator<String> f3 = s -> s + "문자열";
        BinaryOperator<String> f4 = (s1, s2) -> s1 + s2;


    }

}
