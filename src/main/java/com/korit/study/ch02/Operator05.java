package com.korit.study.ch02;

public class Operator05 {
    public static void main(String[] args) {
        String r = 10 > 0 ? "영 보다 커" : "영 보다 작아";
        double r2 = 10 > 0 ? 1.1 : 2.2;
        char r3 = 10 > 0 ? 'o' : 'x';
        String r4 = -10 > 0  ? "영보다 커" : -10 > -20 ? "마이너스 이십보다 커" : "작아";
        String r5 = 2002 % 100 == 0 ? "100의 배수" : "100의 배수가 아님";


        int year = 1999; // 2024년, 2000년 윤년
        //윤년인지 확인하세요.(4의 배수이면서 100의 배수가 아니거나) 또는 400의 배수

        String result = (year % 4 == 0 && year % 100 != 0)|| year % 400 == 0 ? "윤년입니다" : "평년입니다." ;
        System.out.println(result); //윤년입니다. / 평년입니다.

        int 현재잔액 = 150000;
        int 출금금액 = 140000;
        boolean 출금불가능 = 현재잔액 - (출금금액 + 1000) < 0;

        String 상태 = 출금불가능 ? "실패" : "성공";
        int 출금액 = 출금불가능 ? 0 : 출금금액 + 1000; //수수료 1000원 포함
        int 거래후잔액 = 출금불가능 ? 현재잔액 : 현재잔액 - (출금금액 + 1000);

        System.out.println("거래 상태: " + 상태);
        System.out.println("출금액: " + 출금액 + "원 (수수료 1000원 포함)");
        System.out.println("거래 후 잔액: " + 거래후잔액);


//        Copy// 테스트 케이스 1
        int baseSalary = 4000000;    // 기본급
        int workYears = 12;          // 근무년수
        int position = 3;            // 직급코드 (1:사원, 2:대리, 3:과장, 4:부장)
        int overtimeHours = 15;      // 야근시간

//         테스트 케이스 2 (추가로 테스트해볼 값들)
//         int baseSalary = 3500000, workYears = 18, position = 4, overtimeHours = 8;
//         int baseSalary = 2800000, workYears = 5, position = 2, overtimeHours = 25;


//        === 급여 명세서 ===
//        기본급: 4,000,000원
//        직급: 과장
//        직급수당: 1,000,000원
//        연차수당: 400,000원 (10%)
//        야근수당: 175,000원 (기본 10시간 + 초과 5시간)
//        특별보너스: 0원
//        총 지급액: 5,575,000원
//        세금(15%): 836,250원
//        실수령액: 4,738,750원




//                 테스트 데이터
//                int baseSalary = 4000000;
//                int workYears = 12;
//                int position = 3;
//                int overtimeHours = 15;

                // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
                // 직급수당 계산
                int positionAllowance = position == 1 ? 0 : position == 2 ? 500000 : position == 3 ? 1000000 : position == 4 ? 2000000 : 0 ;

                // 연차수당 계산 (기본급 기준 %)
                int yearAllowance = (int)(workYears < 3 ? 0
                        : workYears > 4 && workYears < 8 ? (baseSalary * 0.05)
                        : workYears > 6 && workYears < 16 ? (baseSalary * 0.1)
                        : workYears >= 15 ? (baseSalary * 0.2) : 0);

                // 야근수당 계산
                int overtimePayment = (overtimeHours < 11) ? overtimeHours * 10000 : (overtimeHours > 10) ? overtimeHours * 15000 : 0;
        System.out.println(overtimePayment);

                // 특별보너스 계산
                int specialBonus = position == 4 && workYears > 14 ? 500000 : 0;

                // 총 지급액 계산
                int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;

                // 세금 계산
//                int tax =

                // 실수령액 계산
//                int finalSalary =

                // 직급명 출력용
//                String positionName =

                // 결과 출력
                System.out.println("=== 급여 명세서 ===");
                System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
                // 나머지 출력 구현







    }
}
