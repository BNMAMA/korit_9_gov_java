package com.korit.study.ch02;

public class Operator04 {
    public static void main(String[] args) {

//        관계 연산자
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b;
        boolean h = a != b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int n = 10;
        boolean r = n >= 5  &&  n <= 15; // 5 ~ 15 사이면 n의 값이 true;
        System.out.println(r);
        a = 10;
        b = 10;
        System.out.println("a" == "b");
        System.out.println("a".equals("a"));
        System.out.println(true == true);
        System.out.println(false == false);
        System.out.println('a' == 'a');

        int 키 = 170;
        int 몸무게 = 65;
        double BMI =  (몸무게 /(((double) 키) / 100*((double) 키 / 100)));    //키에서 몸무게 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과
        System.out.println(BMI);
        boolean 저체중 = BMI < 18.5 ;        //18.5미만
        boolean 정상 = BMI >= 18.5  && BMI < 25;         //18.5에서 24.9사이
        boolean 과체중 = BMI >= 25   && BMI < 30 ;        //25에서 29.9사이
        boolean 비만 = BMI >= 30 ;                         //30이상

//        변수는 항상 왼쪽!
//        정수는 초과/미만   실수는 이상/이하

        System.out.println("저체중 " + 저체중);
        System.out.println("정상 " + 정상);
        System.out.println("과체중 " + 과체중);
        System.out.println("비만 " + 비만);


//        급여 계산(근로기준법 총 근로시간 40시간, 나머지는 시간외 근무시간)
        int 기본급 = 2400000;
        int 근무시간 = 52 * 4;
        int 시급 = 2400000 / 160;
        int 시간외수당 = (int) (시급 * 1.5 * 48);
        int 총급여 =  (int) (2400000 + 시간외수당) ;  //기본급 + (시간외 수당 * 1.5배)

        int 세금 = 총급여 / 10; //총 급여의 10%
        int 지급급여 = 총급여 - 세금 ; //총 급여 - 세금
        System.out.println("총급여: " + 총급여);
        System.out.println("세금: " + 세금);
        System.out.println("지급급여: " + 지급급여);

    }
}
