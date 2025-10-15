package com.korit.study.ch08;

import java.util.Scanner;

public class Array05 {
    public static String[] products = new String[]{"아이폰17", "아이폰16", "아이폰15", "갤럭시25", "갤럭시24", "갤럭시23"};
    public static int[] prices = new int[] {1300000, 1250000, 12000000, 1000000, 950000, 900000};


    public static void main(String[] args) {
        System.out.println("[ 휴대폰 시장 정보 시스템 ]");
        showMainView();
    }

    public static void showMainView() {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 조회");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int selectedNumber = sc.nextInt();
            sc.nextLine();

            if (selectedNumber == 0) {
                isExit = true;
            } else if (selectedNumber == 1) {

            }
        }
    }

    public static void registerProduct() {
        Scanner sc = new Scanner(System.in);
        String newProduct = null;
        int newPrice = 0;
        while (true) {
            System.out.println("[휴대폰 기종 추가 기능]");
            System.out.println("휴대폰 기종: ");
            newProduct = sc.nextLine();
            System.out.println("휴대폰 가격: ");
            newPrice = sc.nextInt();
            if (findByPhone(newProduct) == null) {
                break;
            }
//            } else if (findByPrice(newPrice)) {
//
//            }
            System.out.println("이미 존재하는 기종입니다. 다시 입력하세요");
        }


    }

    public static String findByPhone(String product) {
        for (String p : products) {
            if (p.equals(product)) {
                return p;
            }
        }
        return null;
    }

    public static void addProduct(String product) {
        String[] newProduct = new String[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newProduct[i] = products[i];
        }
        newProduct[newProduct.length - 1] = product;
        products = newProduct;

    }

    public static void addPrice(int price) {
        int[] newPrice = new int[prices.length + 1];
        for (int i = 0; i < prices.length; i++) {
            newPrice[i] = prices[i];
        }
        newPrice[newPrice.length - 1] = price;
        prices = newPrice;
    }

    public static void showNameList() {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        while (true) {
            System.out.println("휴대폰 정보 조회");
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
        return products.length % size == 0 ? products.length / size : products.length / size + 1;
    }

    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size; // (1 - 1) * 10 => 0, (2 - 1) * 10 => 20
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && products.length % size != 0 ? products.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = products[i];
        }
        return paginationArray;

    }


}
