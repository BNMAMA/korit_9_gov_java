package com.korit.study.ch19;

import java.util.Scanner;

public class 최상위클래스 {
    public static void main(String[] args) {
        int a = 10; //숫자 자료형 일 때만 산수가 가능하다
        double b = a;
        Object c = a;
        Object d = b;
        Object e = "test";
        String f = "abc";
        Car car = new Car("k3", "화이트");
        Car car2 = new Car("k3", "화이트");
        Book book = new Book("k3", "화이트");
        System.out.println(car.equals(book));
        System.out.println(car.hashCode() == book.hashCode());

        System.out.println(car.equals(car2));
        Object g = car;

        String h = car.toString();

        System.out.println(car);
//        System.out.println(c + d);
        String name1 = "김준일";
        String name2 = "김준일";
        boolean result1 = name1 == name2;
        System.out.println(result1);

        //객체 생성하면 주소값도 새로 생성한다
        String name3 = new String("김준일");
        System.out.println(name3 + "입니다");

        Scanner scanner = new Scanner(System.in);
        String name4 = scanner.nextLine();
        System.out.println(name4);


        boolean result2 = name1.equals(name3);
        System.out.println(result2);

        boolean result3 = name2 == name4;
        System.out.println(result3);
    }

}
