package com.korit.study.ch12;

public class BoardPrintService {

//    void printInfoAll(Board board1) {
//
//
//        printInfoWriter(board1.writer);
//
//
//
//    }
//
//
//
//    void printInfoWriter(Writer writer) {
//        System.out.println("[글쓴이 정보]");
//        System.out.println("글쓴이 아이디: " + writer.id);
//        System.out.println("글쓴이 이름: " + writer.name);
//    }
//
//    void printInfoComments1(Comment[] comments2) {
//        System.out.println("[전체 댓글]");
//        for (Comment comment : comments2) {
//            printInfoComment(comment);
//        }
//    }
//
//    void printInfoComments2 (Comment[] comments1){
//        System.out.println("[전체 댓글]");
//        for (Comment comments : comments1) {
//            printInfoComment(comments);
//        }
//
//    }
//
//    void printInfoComment(Comment comment) {
//        System.out.println("[댓글]");
//        System.out.println("사용자 아이디: " + comment.id);
//        System.out.println("내용: " + comment.contents);
//        System.out.println("작성자: " + comment.writer);
//    }
//
//    void printInfoBoard1(Board board1) {
//        System.out.println("[게시판]");
//        System.out.println("사용자 아이디: " + board1.id);
//        System.out.println("제목: " + board1.title);
//        System.out.println("내용: " + board1.contents);
//        System.out.println("작성자: " + board1.writer.name);
//        System.out.println("댓글: " + board1.);
//    }

    void printAll(Board[] boards) {
        System.out.println("게시글 정보 전체 출력");
//        for (int i = 0; i < boards.length; i++) {
//            Board board = boards[i];
//            System.out.println("게시글 ID: " + board.id);
//            System.out.println("게시글 제목: " + board.title);
//            System.out.println("게시글 내용: " + board.contents);
//            System.out.println("게시글 작성자 ID: " + board.writer.id);
//            System.out.println("게시글 작성자 이름: " + board.writer.name);
//            for (int j = 0; j < board.comments.length; j++) {
//                Comment comment = board.comments[j];
//                System.out.println("댓글 ID: " + comment.id);
//                System.out.println("댓글 내용: " + comment.contents);
//                System.out.println("댓글 작성자 ID: " + comment.writer.id);
//                System.out.println("댓글 작성자 이름: " + comment.writer.name);
//            }
//            System.out.println();
//        }

        for (Board board : boards) {
            System.out.println("게시글 ID: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);
            System.out.println("게시글 작성자 이름: " + board.writer.name);
            for (Comment comment : board.comments) {
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.contents);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.name);
            }
            System.out.println();
        }
    }
}
