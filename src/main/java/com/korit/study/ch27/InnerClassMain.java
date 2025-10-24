package com.korit.study.ch27;

public class InnerClassMain {
    public static void main(String[] args) {
        User user = new User("test1", "1234");//User 생성 1

        System.out.println(user);

        User.UserPrinter userPrinter = user.new UserPrinter(user.toString());//User 생성 될 때 만든 user 객체를 가지고 온다.

        userPrinter.print();

        User.UserPrinter2 userPrinter2 = new User.UserPrinter2(user.toString());
        userPrinter2.print();
    }
}
