package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction {

    //모든 이름 출력 함수
    public static void printNameAll(String[] names) {
        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + "): " + names[i]);
            }
        }
    }

    public static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름입력: ");
        return sc.nextLine();
    }


    public static String[] addToArray(String value, String[] currentArray) {
        String[] newArray = new String[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i]; //원래 있던 배열에서 새로 만든 배열로 이동하는 과정
        }
        newArray[newArray.length - 1] = value; //입력 받은 이름 추가
        return newArray;
    }

    public static String[] addInputNameToNames(String[] names) {
        String name = inputName();
        return addToArray((name), names);
    }


    public static void main(String[] args) {
        String[] names = new String[0];

       printNameAll(names);
       names = addInputNameToNames(names);
       printNameAll(names);
       names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
    }

}
