package com.korit.study.ch06;

import static java.lang.Integer.sum;

public class Function01 {

    public static void main(String[] args) {
        int result = sum(10, 20, 30, 40);
        System.out.println(result);
    }

//    함수 정의
    static int sum(int a, int b, int c, int d) {
//    메모리 고정
        return sum2(a, b) + sum2(c, d);

    }

    static int sum2(int a, int b){
        return  a +  b;
    }

}
