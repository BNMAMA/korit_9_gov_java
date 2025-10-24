package com.korit.study.ch25;

import com.korit.study.ch24.Board;
import com.korit.study.ch24.Comment;
import com.korit.study.ch24.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 불변 컬렉션(읽기 전용) - 생성 하기 전에 애초에 값이 존재 해야 함(전달의 목적으로 값을 쓰기만 할 수 있음)
public class ImmutableCollection {
    public static void main(String[] args) {
        List<String> iList = List.of("김준일", "김준이", "김준삼");
//        iList.add("김준삼");
        System.out.println(iList);

        //수정 불가(읽기 전용)
        Map<String, List<String>> iMap = Map.of(
                "k1", List.of("김준일", "김준이"),
                "k2", List.of("김준삼", "김준사"),
                "k3", List.of("김준오", "김준육"),
                "k4", List.of("김준칠", "김준팔", "김준구")
        ); //무조건 한쌍씩 넣어야 함

        List<Board> boards = new ArrayList<>();
        boards.add(new Board("제목1", new Writer("김준일", 32),
                "내용1",
                List.of(
                        new Comment(new Writer("김준이", 32), "댓글1"),
                        new Comment(new Writer("김준삼", 33), "댓글2")
                ))
        );

        System.out.println(iMap);
        System.out.println(boards);

    }
}
