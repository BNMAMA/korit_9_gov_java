package com.korit.study.ch27;

public class ProductMain {
    public static void main(String[] args) {
        Product product = Product.builder()
                .name("상품1")
                .price(1000)
                .size("L")
                .build();

        System.out.println(product);

    }
}
