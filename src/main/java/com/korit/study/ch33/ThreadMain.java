package com.korit.study.ch33;

class Counter {
    private int count = 0;
        // 동기화 시킴 (문이 생기는 개념 - 들어갔다 나왔다 할 때 딜레이가 살짝 생김)
    public synchronized void increment() {
        count++;
    }
    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        /*
        * Thread(쓰레드)
        * 1. 싱글쓰레드: 쓰레드 하나만 사용의 의미(main메서드 하나만 사용)
        * 2. 멀티쓰레드: 쓰레드 두개 이상 사용(=쓰레드 객체를 2개 이상 쓴다)
        * */
        // 정보를 서로 공유함 - 동기화
        int sum = 0;
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> { //locking 할 때 동기화가 일어남
            for (int i = 0; i < 1000; i++) {
                System.out.println("1번 반복문: " + i);
                counter.increment();
            }
        });


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("2번 반복문: " + i);
                counter.increment();
            }
        });

        System.out.println("쓰레드 시작");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            // 여기부터 Thread1과 Thread2가 종료될 때까지 기다려라
            // (아니면 main 메서드부터 실행되고 thread가 진행 됨)
            // main이 wait 상태가 됨
            System.out.println(counter.getCount());
            System.out.println("쓰레드 종료");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

