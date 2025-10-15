package com.korit.study.ch04;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        /*구구단*/
        Scanner sc = new Scanner(System.in);
        int startDan = sc.nextInt();
        int endDan = sc.nextInt();

        int danRange = endDan - startDan + 1;

        for (int i = 0; i < danRange ; i++) {
            int dan = (endDan - i);
            System.out.println(i  + "단");
            for (int j = 0; j < 9; j++) {
                int num = 9 - j;
                System.out.printf(String.format("%d x %d = %d" , dan, num, dan * num));

            }

        }
    }


}
