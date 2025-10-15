package com.korit.study.ch05;

public class Practice {
    public static void main(String[] args) {

//            1번
//        int[] nums = new int[]{10, 20, 30, 40, 50};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//            2번
//        int sum = 0;
//        int[] nums = new int[]{5, 10, 15, 20, 25};
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (i == 4) {
//                System.out.println("배열 요소들의 합: " + sum);
//            }
//        }
//        System.out.println(sum);

//            3번
//        int max = 0;
//        int[] nums1 = new int[]{23, 45, 12, 67, 34, 89, 11};
//        for (int i = 0; i < nums1.length; i++) {
//
//            max = nums1[i] > max ? nums1[i] : max;


//            if (nums1[i] > max) {
//                max = nums1[i];
//            }


//            4번
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evens = new int[0];
        System.out.println("짝수: ");

//
            int[] evense = new int[0];
            for (int i = 0; i < nums2.length; i++) {  //i는 배열안에 들어가는 인덱스를 의미함
                if (nums2[i] % 2 == 0) {
                    int[] temp = new int[evense.length + 1]; //새로운 방 + 방 1칸 더
                    for (int j = 0; j < evense.length; j++) {
                        temp[j] = evense[j]; //기존 evense에 살고 있는 입주민 -> temp 옮기는 과정
                    }

                    evense[evense.length - 1] = nums2[i];
                    temp = evense;  //주소를 옮기는 과정
                    System.out.println(nums2[i]);

                }

            }

    }
}
