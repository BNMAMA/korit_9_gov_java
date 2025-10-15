package com.korit.study.ch05;

public class Star2 {
    public static void main(String[] args) {

        //별만들기
        int num = 11;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (i < (num / 2) ? (num / 2) - i : i - (num / 2)) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i < (num / 2) ? (i * 2) + 1 : ((num - i - 1) * 2) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        //오름차순
        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (i * 2) + 1 : ((num - i - 1) * 2) + 1);

        }
        //내림차순
        for (int i = 0; i < num; i++) {
            System.out.println(i < (num / 2) ? (num / 2) - i : i - (num / 2));

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i);

        }
    }
}
