package com.korit.study.ch27;

public class BuilderMain {
    public static void main(String[] args) {
        BuilderStudy builderStudy = new BuilderStudy("김준일", 32);
        BuilderStudy builderStudy1 = BuilderStudy.builder()
                .value2(32)
                .build();

//        Product product = Product.builder.name("상품1").price(1000).size("L").build();
//        System.out.println(product);
    }
}