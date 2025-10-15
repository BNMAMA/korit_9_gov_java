package com.korit.study.ch06;

import javax.xml.crypto.Data;
import java.util.Date;

public class 연습문제 {
    public static void main(String[] args) {
        hello();
        hello("김소현");

        System.out.println(power(5));
        System.out.println(time(11,40));

        double r1 = add(2.5, 2.5);
        System.out.println(r1);

        int r2 = add(1, 2, 3);
        System.out.println(r2);

        printInfo("김백년", 4);
        prinInfo("김백년", 4, "천년학교");

    }

    public static void hello() {
        System.out.println("안녕하세요");
    }

    public static void hello(String name) {
        System.out.println("안녕하세요 " + name + "님!");
    }

    public static int power(int number) {
        return number * number;

    }

    public static String time (int hours, int minutes) {
        Date now = new Date();
        int nowhours = now.getHours();
        int nowminutes = now.getMinutes();

        return hours == nowhours && minutes == nowminutes ? "현재 시간입니다." : "현재 시간이 아닙니다";
    }

    public static double add(double a, double b) {
        return  a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void printInfo(String name, int age) {
        System.out.println("이름은 " + name + "이고, 나이는 " + age + "입니다.");
    }

    public static void prinInfo(String name, int age, String school) {
        System.out.println("이름은 " + name + ", 나이는 " + age + ", 학교는 " + school + " 입니다.");

    }
}
