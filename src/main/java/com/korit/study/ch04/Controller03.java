package com.korit.study.ch04;

import java.util.Scanner;

public class Controller03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isOpen = true;

//        특정 조건이 중요!
        while (isOpen) { //true일 때만 실행
            System.out.println("문을 열고 들어왔습니다.");
            System.out.println("문을 닫으시겠습니까? (y/n)");
            String cmd = sc.nextLine();
            isOpen = !"y".equals(cmd);
            System.out.println("1111");
        }

        System.out.println("문을 닫고 나왔습니다.");

        while (true) {
            System.out.println("문을 열고 들어왔습니다.");
            System.out.println("문을 닫으시겠습니까? (y/n)");
            String cmd = sc.nextLine();
            if (isOpen = !"y".equals(cmd)) {
                break;
            }
            System.out.println("2222");
        }
        while (true) {
            System.out.println("첫번 째 반복 y/n: ");
            String cmd = sc.nextLine();
            if ("y".equals(cmd)) {
                while (true) {
                    System.out.println("두번 째 반복 y/n: ");
                    String cmd2 = sc.nextLine();
                    if ("n".equals(cmd2)) {
                        break;
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
        }
    }
}
