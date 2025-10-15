package com.korit.study.ch08;

import java.util.Scanner;

public class Array04 {
    public static String[] names = new String[] {"김준일", "김준이", "김준삼", "김준사", "김준오", "김준육", "김준칠", "김준팔", "김준구"};


    public static void main(String[] args) {
        //추가(Create), 조회(Read), 수정(Update), 삭제(Delete)
        System.out.println("[ 이름 관리 시스템 ]");
        showMainMenuView();

    }

    public static void showMainMenuView() {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. 이름 추가");
            System.out.println("2. 이름 조회");
            System.out.println("3. 이름 수정");
            System.out.println("3. 이름 삭제");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int selectedNumber = sc. nextInt();
            sc.nextLine();


            if (selectedNumber == 0) {
                isExit = true;
            } else if (selectedNumber == 1) {
                registerName();
            } else if (selectedNumber == 2) {
                showNameList();
            }
        }
    }

    public static void registerName() {
        Scanner sc = new Scanner(System.in);
        String newName = null;
        while (true) {
            System.out.println("[이름 추가 기능]");
            System.out.println("이름 입력: ");
            newName = sc.nextLine();
            if (findByName(newName) == null) {
               break;
            }
            System.out.println("이미 존재하는 이름입니다. 다시 입력하세요.");
        }


        addName(newName);
        System.out.println("이름 추가 완료");

    }

    public static String findByName(String name) { //forEach문은 인덱스 번호가 없음 -> 값을 바로 꺼내서 씀
        for (String n : names) {
            if (n.equals(name)) {
                return n;
            }
        }
        return null;
    }

    public static void addName(String name) {
        String[] newArray = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newArray[i] = names[i];
        }
        newArray[newArray.length - 1] = name;
        names = newArray;
    }

    public static void showNameList() {
        Scanner sc = new Scanner(System.in);
        int size = 2;
        while (true) {
            System.out.println("사용자 정보 조회");
            System.out.println("뒤로가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력 (1 ~ %d): ", getLastPage(size));
            int selectedPage = sc.nextInt();
            sc.nextLine();

            if (selectedPage == 0) {
                break;
            } else if(selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지를 찾을 수 없습니다.");

            } else {
                String[] namesOfPagination = pagination(selectedPage, size);
                for (int i = 0; i < namesOfPagination.length; i++) {
                    System.out.printf("%d. %s\n ", i + 1, namesOfPagination[i]);
                }
            }
        }

    }

    public static int getLastPage(int size) {
        return names.length % size == 0 ? names.length / size : names.length / size + 1;
    }

    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size; // (1 - 1) * 10 => 0, (2 - 1) * 10 => 20
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && names.length % size != 0 ? names.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = names[i];
        }
        return paginationArray;

    }
}
