package com.korit.study.ch03;

import java.util.Scanner;

public class input04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = "김준일".charAt(0);
        //문자들을 적을 수는 있지만 0번 인덱스에 있는 문자만 출력
        System.out.println(a);
        char b = scanner.next().charAt(0);
        System.out.println(b);
    }
}
