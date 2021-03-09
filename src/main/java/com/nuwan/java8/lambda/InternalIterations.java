package com.nuwan.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class InternalIterations {
    public static void main(String[] args) {
        List<Person> list= Arrays.asList(
                new Person("nuwan",20),
                new Person("sen",30)
        );
        impl1(list);
        impl2(list);
        impl3(list);
    }
    private static void impl1(List<Person> list) {
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    private static void impl2(List<Person> list) {
        for(Person p:list)
            System.out.println(p);
    }

    private static void impl3(List<Person> list) {
        list.forEach(System.out::println);
    }

}

