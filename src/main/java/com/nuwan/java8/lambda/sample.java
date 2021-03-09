package com.nuwan.java8.lambda;

import java.util.*;

public class sample {
    public static void main(String[] args){
        List<Person> people= Arrays.asList(
                new Person("nuwan","sen",41),
                new Person("nuwan2","sen2",42)
        );
        withLambda(people);
        nolambda(people);
    }

    private static void nolambda(List<Person> people) {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return  p2.lastname.compareTo(p1.lastname);
            }
        });
        print(people);
    }

    private static void withLambda(List<Person> people) {
        Collections.sort(people,(p1,p2)->p2.lastname.compareTo(p1.lastname));
        print(people);
    }

    private static class Person {
        String name; String lastname; int age ;
        public Person(String name, String lastname, int age) {
            this.name=name;
            this.lastname=lastname;
            this.age=age;
        }
    }
    private static void print(List<Person> people) {

        for (Person p: people) {
            StringBuilder sb=new StringBuilder();

            sb.append(p.lastname).append(" - ").append(p.age).append(" - ").append(p.name);
            System.out.println(sb);
        }
        System.out.println("------------");
    }
}
