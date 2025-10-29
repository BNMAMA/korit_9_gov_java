package com.korit.study.ch31;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {  //throws IOException //메인에서 예외처리는 main이 호출될 때까지 미룬다
        List<String> names = List.of("김준일", "김준이");
        try {
            print(null, 3);

        } catch (IOException e) {

        } catch (NullPointerException e) {
            System.out.println("리스트 변수에 null이 들어가 있어");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열크기 넘었어");

        } catch (Exception e) { //상위 예외처리 항상 제일 마지막에 예외 처리
            System.out.println("최종적으로 모든 예외 처리");

        } finally { //정상처리 , 오류 상황 둘 다 실행됨
            System.out.println("프로그램 정상 종료");

        }
    }

    public static void print(List<String> names, int size) throws
            IOException,
            NullPointerException,
            ArrayIndexOutOfBoundsException{

        System.out.println(names.size());
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }



    }
}
