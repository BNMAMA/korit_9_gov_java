package com.korit.study.ch05;

public class Array01 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int[] nums = {1, 2, 3, 4, 5};
        int[] num2 = new int[]{1, 2, 3};

        int[] num3 = new int[3];
        num3[0] = 1;
        num3[1] = 2;
        num3[2] = 3;

        System.out.println(new int[] {1, 2, 3} [0]);
//        반복, 관련 있는것끼리 묶기

        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }

        String[] names = new String[] {"김준일 ", "김준이", "김준삼"};
        for (int i = 0; i < 3; i++) {
            System.out.println("이름; " + names[i]);
        }

        //forEach
        for (int num : new int[] {1,2,3,4}) {
            System.out.println(num);
        }

    }
}
