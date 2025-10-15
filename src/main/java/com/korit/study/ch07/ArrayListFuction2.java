package com.korit.study.ch07;

import com.sun.jdi.Value;

import java.util.Scanner;

public class ArrayListFuction2 {

    public static void printNumAll(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("등록된 번호가 없습니다.");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("번호(" + (i + 1) + "): " + numbers[i]);
            }
        }
    }

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        int number = -1;
        while (true) {
            System.out.print("번호입력: ");
            number = sc.nextInt();
            if (number > 0 && number < 46) {
                break;
            }
            System.out.println("입력할 수 없는 번호입니다.");
        }



        return number;
    }

    public static int[] addArray(int value, int[] currentArray) {
        int[] newArray = new int[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static int[] addInputNumToNumbers(int[] numbers) {
        int number = inputNumber();
        return addArray(number, numbers);
    }



    public static void main(String[] args) {
        // 복권번호 6자리
        int[] numbers = new int[0];

        printNumAll(numbers);
        numbers = addInputNumToNumbers(numbers);
        printNumAll(numbers);
        numbers = addInputNumToNumbers(numbers);
        printNumAll(numbers);
        numbers = addInputNumToNumbers(numbers);
        printNumAll(numbers);
        numbers = addInputNumToNumbers(numbers);
        printNumAll(numbers);
        numbers = addInputNumToNumbers(numbers);
        printNumAll(numbers);
        numbers = addInputNumToNumbers(numbers);

    }
}
