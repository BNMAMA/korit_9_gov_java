package com.korit.study.ch33;

public class ThreadMain {
    public static void main(String[] args) {

        int sum = 0;

        Thread thread1 = new Thread(() -> { //locking 할 때 동기화가 일어남
            for (int i = 0; i < 10; i++) {
                System.out.println("1번 반복문: " + i);
                sum += i;
            }
        });


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("2번 반복문: " + i);
                sum += i;

            }
        });

        System.out.println("쓰레드 시작");
        thread1.start();
        thread2.start();
        System.out.println("쓰레드 종료");
    }
}

