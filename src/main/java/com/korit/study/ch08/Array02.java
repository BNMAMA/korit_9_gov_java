package com.korit.study.ch08;

public class Array02 {
    public static void main(String[] args) {
        String[] ID = new String[]{"E1001", "E1002", "E1003", "E1004"};
        String[] name = new String[]{"김민준", "이서연", "박지훈", "최예나"};
        String[] 부서 = new String[]{"영업팀", "마케팅팀", "개발팀", "인사팀"};
        String[] 직급 = new String[]{"사원", "대리", "과장", "차장"};

        String name2 = "최예나";

        int foundIndex = -1;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == name2) {
                foundIndex = i;
                System.out.println(foundIndex);
                break;
            }
        }

        printInfo(ID, name, 부서, 직급, foundIndex);



    }

    public static void printInfo(String[] Id, String[] name, String[] 부서, String[] 직급, int index) {

//        String text = String.format("""
//                ID: %s
//                이름: %s
//                부서: %s
//                직급: %s
//                """, Id[index], name[index], 부서[index], 직급[index]);
//        System.out.println(text);

        System.out.printf("""
                ID: %s
                이름: %s
                부서: %s
                직급: %s
                """, Id[index], name[index], 부서[index], 직급[index]);
    }
}
