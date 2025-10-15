package com.korit.study.ch02;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {
//                Copy// 테스트 케이스 1
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
        int positionAllowance = position == 1 ? 0 :
                                position == 2 ? 500000 :
                                position == 3 ? 1000000 :
                                position == 4 ? 2000000 : -1 ;
//                              계산할 수 없는 것들은(오류) -1로 표현

        // 연차수당 계산 (기본급 기준 %)
//        int yearAllowance = (int)(workYears < 3 ? 0
//                : workYears < 7 ? baseSalary * 0.05
//                : workYears < 15 ? baseSalary * 0.1
//                : baseSalary * 0.2);
//        double -> int
        double yearRate = workYears < 3 ? 0.0 : workYears < 7 ? 0.05
                : workYears < 15 ? 0.1 : 0.2;

//        연차수당
        int yearAllowance = (int) (baseSalary * yearRate);


        // 야근수당 계산
        boolean isOverTime = overtimeHours - 10 > 0;
        int baseOvertime = overtimeHours - 10 > 0 ? 10 : overtimeHours;
        int overTime = overtimeHours - 10 > 0 ? overtimeHours - 10 : 0;
        int overtimePayment = isOverTime ? ((overtimeHours -10) * 15000) + (10 * 10000) : overtimeHours * 10000;
        System.out.println(overtimePayment);

        // 특별보너스 계산
        int specialBonus = position == 4 && workYears > 14 ? 500000 : 0;

        // 총 지급액 계산
        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;

        // 세금 계산
//        int tax = (int)(totalSalary <= 5000000 ? 0.1 * totalSalary : 0.15 * totalSalary );
        double taxRate = totalSalary <= 5000000 ? 0.1 : 0.15;
        int tax =(int) (totalSalary * taxRate);


        // 실수령액 계산
        int finalSalary = totalSalary - tax;



        // 직급명 출력용
        String positionName = position == 1 ? "사원" :
                        position == 2 ? "대리" :
                        position == 3 ? "부장" : "미지정" ;

        // 결과 출력
        System.out.println("=== 급여 명세서 ===");
        System.out.println("기본급: " + String.format("%,d ", baseSalary ) + "원");
        System.out.println ("직급: " + positionName);
        //                                    String 값으로 변환 함수
        System.out.println("직급수당: " + String.format("%,d ", positionAllowance ) + "원");
        System.out.println( String.format("연차수당: %,d ", yearAllowance ) + "원");
        System.out.printf("야근수당: %,d원  (기본 %d시간 + 초과 %d시간)\n", overtimePayment , baseOvertime, overTime);
        System.out.println("직급수당: " + String.format("%,d ", positionAllowance ) + "원");
        System.out.println("특별보너스:  " + String.format("%,d", specialBonus) + "원");

        // 나머지 출력 구현



    }
}
