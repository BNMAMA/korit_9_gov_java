package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "";
        String code = "";
        String productName = "";
        int num = 0;
        int price = 0;
        int total = 0;
        int priceTotal = 0;
        int addressNum = 0;
        String address = "";
        int orderPrice ;


        System.out.print("고객 ID를 입력하세요: ");
        id = sc.next();
        System.out.print("상품 코드를 입력하세요: ");
        code = sc.next();
        sc.nextLine();
        System.out.print("상품명을 입력하세요: ");
        productName = sc.nextLine();
        System.out.print("수량을 입력하세요: ");
        num = sc.nextInt();
        System.out.print("단가를 입력하세요: ");
        price = sc.nextInt();
        System.out.print("우편번호를 입력하세요: ");
        addressNum = sc.nextInt();
        sc.nextLine();
        System.out.print("배송 주소를 입력하세요: ");
        address = sc.nextLine();
        orderPrice = priceTotal > 30000 ? 0 : 3000;
        total = (price * num) + orderPrice;

        System.out.println("================주문 확인서============");
        System.out.println("고객 ID: " + id);
        System.out.println(String.format("""
                상품 정보:
                    -상품코드: %s
                    -상품명: %s
                    -단가: %,d원 x %,d개
                배송 정보:
                    -우편번호: %d
                    -주소: %s
                    -배송비: %,d원
                총 결제 금액: %,d원""", code, productName, total, num, addressNum, address, orderPrice, total));



    }
}
