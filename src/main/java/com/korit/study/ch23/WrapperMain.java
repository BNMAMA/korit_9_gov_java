package com.korit.study.ch23;

import java.util.ArrayList;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = 10; //autoBoxing
//        Integer num3 = new Integer(10);
       int num4 = num2;    //autoUnBoxing


        String numStr = Integer.toString(num);
                        //정수를 -> 문자열로
        String numStr2 = "" + num;
        String numStr3 = num2.toString();
        // 모든 참조 자료형은 Object 상속을 받는다.
        // 참조 자료형은 값 뿐만 아니라 기능(메소드)도 가진다.






    }
}
