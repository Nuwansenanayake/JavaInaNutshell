package com.nuwan.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("nuwan","","chamara","sena");
        List<String> validNames = names.stream().filter(s ->!s.isEmpty() ).collect(Collectors.toList());
        System.out.println( validNames.stream().collect(Collectors.joining(", ")));

        validNames.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList =numbers.stream()
                .map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("print squere");
        squaresList.forEach(System.out::println);
        squaresList.forEach(
                num -> System.out.println(num)
        );

        System.out.println("limit for 3 ...");
        squaresList.stream().limit(3).forEach(System.out::println);

        System.out.println("Sort... ");
        squaresList.stream().sorted().forEach(System.out::println);

        IntSummaryStatistics statistics = squaresList.stream().mapToInt(i -> i).summaryStatistics();
        System.out.println("Stats: "+statistics.getMax()+" "+ statistics.getSum()+" "+ statistics.getAverage());

        System.out.println("Count: "+squaresList.parallelStream().count());

    }
}
