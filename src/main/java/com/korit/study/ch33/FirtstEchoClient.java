package com.korit.study.ch33;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLOutput;

public class FirtstEchoClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "";
        final int SERVER_PORT = 5000;

        try {
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);//클라이언트 정보를 가지고 소켓을 만든다)
            System.out.println("서버 접속 완료");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            String message = "소켓 통신 데이터입니다.";
            System.out.println(message);
            writer.println(message);//메세지 전송
            writer.flush(); //버퍼를 비우는 행위

            String responseMessage = reader.readLine();
            System.out.println("응답 데이터: " + responseMessage);

            reader.close();
            writer.close();
            socket.close();
            System.out.println("클라이언트 종료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //단방향 -> HTTP
        //양방향 -> 소켓통신(클라이언트, 서버) 둘 다 있음

    }
}
