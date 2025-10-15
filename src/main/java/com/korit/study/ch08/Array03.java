package com.korit.study.ch08;

public class Array03 {
    public static void main(String[] args) {
        int[] nums = {15, 23, 7, 30, 4, 18};
        int 탐색횟수 = 0;
        int 찾은인덱스 = 0;

        // 30을 찾기 위한 탐색 시도가 몇번 있었는지와 30의 인덱스 위치를 출력하시오.
        for (int i = 0; i < nums.length; i++) {
//            탐색횟수 = i + 1;
            탐색횟수++;

            if (nums[i] == 30) {
                찾은인덱스 = i;
                break;


            }

        }
    }
}
