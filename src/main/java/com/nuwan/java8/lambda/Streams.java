package com.nuwan.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Person> list= Arrays.asList(
                new Person("nuwan",20),
                new Person("sen",30)
        );

        list.stream()
                .filter(person -> person.name.startsWith("s"))
                .forEach(person -> System.out.println(person.name));

    }
}
