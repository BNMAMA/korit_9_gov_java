package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        List<String> uppercase = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercase);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(square);

        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        List<Integer> le = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(le);

        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        List<Double> tax = prices.stream().map(t -> t + (t * 0.1)).collect(Collectors.toList());
        System.out.println(tax);

        class Person {
            private String name;
            private int age;
            // constructor, getters


            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        List<String> name = people.stream().map(Person -> Person.getName()).collect(Collectors.toList());
        System.out.println(name);

        List<String> usernames = Arrays.asList("john", "mary", "steve");
        List<String> person = usernames.stream()
                .map(n -> "User:" + n)
                .collect(Collectors.toList());
        System.out.println(person);




            // constructor, getters





        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );
                List<String> domains = emails.stream()
                        .map(email -> email.substring(email.indexOf("@") + 1))
                        .toList();

        System.out.println(domains);

        List<String> domains2 = emails.stream()
                .map(email -> email.substring(email.indexOf(".") + 1))
                .toList();

        System.out.println(domains2);

        List<String> domains3 = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1, email.indexOf(".")))
                .toList();

        System.out.println(domains3);











    }



}

