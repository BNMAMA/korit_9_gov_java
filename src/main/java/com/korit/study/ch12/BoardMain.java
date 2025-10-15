package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {
        //Board배열 - boards -> 게시글 2개

        // Board - id(정수), title(문자열), contents(문자열), writer(Writer), comment(Comment[])

        //Writer - id(정수), name(문자열)

        //Comment - id(정수), contetns(문자열), writer(Writer)

        // 1. board배열 2개 공간 생성
        // 2. Writer 3명 생성
        // 3. Comment 4개 생성
        // 4. Board 2개 생성 -> 게시글 작성자와 댓글 작성자는 원하는 작성자를 주입한다.





//        Writer writer1 = new Writer(1, "김소현");
//        Writer writer2 = new Writer(2, "김성엽");
//        Writer writer3 = new Writer(3, "김백년");
//        Writer[] writers = new Writer[]{writer1, writer2, writer3};
////        writers[0] = new Writer(1, "김준일");
////        writers[1] = new Writer(2, "김준일");
////        writers[2] = new Writer(3, "김준일");
//
//
//
//        Comment comment1 = new Comment(1, "간식 먹을까??", writer1 );
//        Comment comment2 = new Comment(2, "산책 가고 싶은데..", writer3);
//        Comment comment3 = new Comment(3, "배고픈데 점심 뭐 먹을래", writer2);
//        Comment comment4 = new Comment(4, "뭐 또 초밥?", writer1);
//
//        Comment[] comments1 = new Comment[]{comment1, comment2};
//        Comment[] comments2 = new Comment[]{ comment3, comment4};
//
//
//
//        Board board1 = new Board(3, "김백년 일기", "엄마랑 놀기", writer3 , comments1);
//        Board board2 = new Board(2, "김성엽의 저녁", "저녁 뭐 먹을래?",
//                writer2, comments2);
//
//        BoardPrintService boardPrintService = new BoardPrintService();
//        boardPrintService.printInfoAll(board1);
//        boardPrintService.printInfoBoard1(board1);
//        boardPrintService.printInfoComments1(comments1);
//        System.out.println("=============================");
////        boardPrintService.printInfoWriter(board1.writer);
        Writer[] writers = new Writer[3];
        writers[0] = new Writer(1, "김준일");
        writers[1] = new Writer(2, "김준이");
        writers[2] = new Writer(3, "김준삼");

        Comment[][] comments = new Comment[2][];
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];
        comments[0][0] = new Comment(1, "게시글1의 댓글1", writers[0]);
        comments[0][1] = new Comment(2, "게시글1의 댓글2", writers[0]);
        comments[0][2] = new Comment(3, "게시글1의 댓글3", writers[2]);
        comments[1][0] = new Comment(4, "게시글2의 댓글1", writers[1]);
        comments[1][1] = new Comment(5, "게시글2의 댓글2", writers[0]);
        comments[1][2] = new Comment(6, "게시글2의 댓글3", writers[2]);


        Board[] boards = new Board[2];
        boards[0] = new Board(1, "테스트 게시글1", "테스트 게시글 내용1", writers[1], comments[0]);
        boards[1] = new Board(2, "테스트 게시글2", "테스트 게시글 내용2", writers[0], comments[1]);

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printAll(boards);    }

}

