package com.korit.study.ch09;




class Car {
    String model;
    String color;
}

public class CarMain {

    public static void main(String[] args) {
        String model = "소나타";
        String color = "검정색";
        String model2 = "아반떼";
        String color2 = "파랑색";

        String[] models = new String[100000];
        String[] colors = new String[100000];
        models[99954] = "소나타";
        colors[99954] = "검정색";

        Car c1 = new Car(); //주소 타고 들어간다 -> 참조한다.
        c1.model = "소나타";
        c1.color = "검정색";

        Car c2 = new Car();
        c2.model = "아반떼";
        c2.color = "파랑색";

        Car c3 = new Car(); //생성자는 기본값으로 초기화 시켜준다
        System.out.println(c3.model); //null

        int a = 10;
        System.out.println(a);


    }
}
