package com.korit.study.ch05;

public class Practice3 {
    public static void main(String[] args) {
        int[] 학년 = {1, 2, 3, 1};
        String[] 이름 = {"철수", "영희", "영철", "길동"};
        String[] 학생 = new String[0]; //{철수(1)", "영희(2)", "영철(3)", "길동(1)" }


        int[] grade = new int[0];
        for (int i = 0; i < 이름.length; i++) {
            String[] temp = new String[학생.length + 1];
            for (int j = 0; j < 학생.length; j++) {
                temp[j] = 학생[j];
            }
            temp[temp.length - 1] = String.format("%s(%d)", 이름[i], 학년[i]);
            학생 = temp;
        }

        for (int i = 0; i < 학생.length; i++) {
            System.out.println(학생[i]);
        }
    }
}

