package com.korit.study.ch30;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;








class Employee {
    private String name;
    private double salary;
    // constructor, getters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%f", salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


}

class EmployeeDTO {
    private String displayName;
    private String salaryInfo;

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }
}


public class StreamEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> num = numbers.stream()
                .filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(num);


        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");
        List<String> word = words.stream()
                .filter(w -> w.length() > 4)
                .collect(Collectors.toList());
        System.out.println(word);

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");
        List<String> name = names.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(name);

        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);
        List<Integer> number = mixedNumbers.stream().filter(n -> n > -1).collect(Collectors.toList());
        System.out.println(number);

        class Product {
            String name;
            int price;
            // constructor, getters

            public Product(String name, int price) {
                this.name = name;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getPrice() {
                return price;
            }
        }
        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );

        class Item {
            String name;
            int stock;
            boolean onSale;
            int price;
            // constructor, getters


            public Item(String name, int stock, boolean onSale, int price) {
                this.name = name;
                this.stock = stock;
                this.onSale = onSale;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getStock() {
                return stock;
            }

            public boolean isOnSale() {
                return onSale;
            }

            public int getPrice() {
                return price;
            }

            @Override
            public String toString() {
                return "Item{" +
                        "name='" + name + '\'' +
                        ", stock=" + stock +
                        ", onSale=" + onSale +
                        ", price=" + price +
                        '}';
            }
        }

        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

        List<Item> filteringItem = items.stream()
                .filter(item -> item.stock > 0 && item.onSale)
                .toList();

        System.out.println(filteringItem);
//        재고가 1개 이상 있고(stock > 0), 할인 중인(onSale = true) 상품만 필터링하세요. 예상 출력: [노트북, 헤드셋]


        // 이중 반복
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);
        List<Integer> filteringNumbers =  numbers2.stream()
               .filter(num2 -> numbers2.stream().filter(num3 -> num3 == num2).count() == 1)
               .toList();
        System.out.println(filteringNumbers);

        List<Integer> filteringNumbers2 = new ArrayList<>();
        for (Integer nums : numbers2) {
            int count = 0;
            for (Integer num2 : numbers) {
                if (num2 == nums) {
                    count++;
                }
            }
        }
        System.out.println(filteringNumbers2);

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );
        System.out.println(LocalDate.of(2024, 1, 1).getDayOfWeek());

        List<LocalDate> filteringDates = dates.stream()
                .filter(localDate -> localDate.getDayOfWeek().name().equals("SATURDAY")
                        || localDate.getDayOfWeek().name().equals("SUNDAY"))
                .toList();

        System.out.println(filteringDates);



    }


}



