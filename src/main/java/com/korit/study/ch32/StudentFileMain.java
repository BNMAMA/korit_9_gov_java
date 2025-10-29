package com.korit.study.ch32;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class StudentFileMain {
    public static void main(String[] args) {
        final String FILE_NAME = "student.txt";
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            StringBuilder builder = new StringBuilder();
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                builder.append((char) readData);
            }
            System.out.println(builder);
            fileReader.close();

            FileWriter fileWriter = new FileWriter(FILE_NAME);

            Map<String, String> modifyDataMap = Map.of(
                    "이름", "김백년",
                    "나이", "4"
            );

            List<String> readLineList = new ArrayList<>();
            readLineList.addAll(Arrays.asList(builder.toString().split("\n")));

            readLineList.stream().map(line -> {
                AtomicReference<String> stringAtomicReference = new AtomicReference<>(line);
                modifyDataMap.entrySet().forEach(entry -> {
                    if (stringAtomicReference.get().contains(entry.getKey())) {
                        stringAtomicReference.set(
                                String.format("%s: %s\n", entry.getKey(), entry.getValue())
                        );
                    }
                });
                return stringAtomicReference.get();
            }).toList().forEach(line -> {
                try {
                    fileWriter.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            });

        } catch (FileNotFoundException e) {
            System.out.println("파일 못찾았어요");
        } catch (IOException e) {
            System.out.println("파일 내부의 내용을 읽지 못했습니다.");
        }
    }
}

