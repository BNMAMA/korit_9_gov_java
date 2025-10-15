package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름: ");
        String name = sc.next();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.print("학년을 입력하세요: ");
        int grade = sc.nextInt();

        System.out.print("국어 점수를 입력하세요: ");
        double score = sc. nextDouble();
        System.out.print("영어 점수를 입력하세요: ");
        double score2 = sc.nextDouble();
        System.out.print("수학 점수를 입력하세요: ");
        double score3 = sc.nextDouble();
        double avg = 0;
        avg =  score + score2 + score3 / 3;
        System.out.println();
        String score4 = avg >= 90 ? "A등급"
                : avg >= 80 ? "B등급"
                : avg >= 70 ? "C등급"
                : avg >= 60 ? "D등급" : "E등급";
        System.out.println("평균: " + avg + "학점: " + score4);
        sc.nextLine();
        System.out.print("자기소개를 작성하세요: ");
        String info = sc.nextLine();

        System.out.println("==========학생 정보===========");
        System.out.println(String.format("""
                이름: %s
                나이: %d세
                성적:
                    국어: %.2f점;
                    영어: %.2f점;
                    수학: %.2f점 (학점: %s)
                자기소개: %s""", name, age, score, score2, score3, score4, info));




    }
}
