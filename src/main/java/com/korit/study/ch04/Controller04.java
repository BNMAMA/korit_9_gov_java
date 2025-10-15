package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            int n = i + 1;
//           초기문  조건문(반복 횟수)  후처리문
//           순서 규칙이  중요
            System.out.printf("%,d = %s\n" , n , n % 2 == 0 ? "짝" : "홀");

            if (i % 2 == 0) {
                System.out.println(i + "홀수입니다");
            } else {
                System.out.println(i + "짝수입니다.");
            }
        }


//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
    }
}
