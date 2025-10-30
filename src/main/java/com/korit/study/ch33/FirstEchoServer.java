package com.korit.study.ch33;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstEchoServer {
    public static void main(String[] args) {
        final int PORT = 5000;

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("에코 서버 실행");

            Socket socket = serverSocket.accept(); //클라이언트의 접속을 기다림(무한루프)
            //연결할 때 씀
            System.out.println("클라이언트 연결");
            System.out.println("IP: " + socket.getInetAddress());
            System.out.println("포트번호: " + socket.getPort());

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //소켓을 통해 주고 받음
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            String message = reader.readLine(); //버퍼리더 열고 기다림(소켓 통신 데이터를 읽음)
            System.out.println("메세지 내용: " + message);
            writer.flush();

            writer.println("서버 응답 내용: " + message);

            reader.close();
            writer.close();
            socket.close();
            serverSocket.close();

            System.out.println("서버 종료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
