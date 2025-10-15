package com.korit.study.ch05;

public class Star {
    public static void main(String[] args) {

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i +1; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 5 ; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 5 ; i++) {
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int n = 21;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -2; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < (i < 2 ? i : i < n - 1 ? 1 : n - 1 - i); j++) {
//                System.out.print(" ");
//            }
            System.out.print(i == 0 || i == n - 2 ? " " : " ");

            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();





    }
}
