package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner s = new Scanner(inputStream);
        String str = s.next();
        System.out.println("입력값:  " + str);
        s.nextLine(); //엔터의 버퍼를 없애기 위해 사용
        String str2 = s. nextLine();
        System.out.println("주소는: " + str2 );
        System.out.println();
    }
}
