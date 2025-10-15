package com.korit.study.ch06;

public class 연습문제2 {
    public static void main(String[] args) {
        checkTemperatureConversion(30); //온도 함수
        System.out.println(calculate(1, 2, 3, 4)); //계산기 함수
    }
    // 섭씨를 화씨로 변환하는 함수
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // 화씨를 섭씨로 변환하는 함수
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void checkTemperatureConversion(double celsius) {
//        celsiusToFahrenheit(celsius);
//        System.out.println("섭씨 -> 화씨: " + celsiusToFahrenheit(celsius));
//        fahrenheitToCelsius(celsiusToFahrenheit(celsius));
//        System.out.println("화씨 -> 섭씨: " + fahrenheitToCelsius(celsiusToFahrenheit(celsius)));
        double fahrenheit = celsiusToFahrenheit(celsius);
        double celsius2 = fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius == celsius2 ? "O" : "X");

    }

    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int subtract(int a, int b) { return a - b; }

    // (a + b) * c - d
    public static int calculate(int a, int b, int c, int d) {
        return subtract(multiply(add(a, b), c), d);
    }

}
