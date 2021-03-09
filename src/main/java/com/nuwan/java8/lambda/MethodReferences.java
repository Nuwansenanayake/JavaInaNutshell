package com.nuwan.java8.lambda;

import javax.xml.transform.sax.SAXSource;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
        impl1();
        impl2();
        impl3();
        impl4();
        impl5();
        impl6();
        impl7constructorReference();
    }

    private static void impl7constructorReference() {
        Function<String, Job> jobCreator = Job::new;
        Job job= jobCreator.apply("dsds");
        System.out.println( job.s);
    }



    private static void impl6() {
        Comparator<String> sc=(first, second) -> first.compareToIgnoreCase(second);

        Comparator<String> sc2=String::compareToIgnoreCase;
        List<String> values = Arrays.asList("Sen", "Nuwan","Lanka");
        Collections.sort(values, sc2);
        System.out.println(values);

    }

    private static void impl5() {
        List names = new ArrayList();
        names.add("Nuwan");
        names.add("Sen");
        names.forEach(System.out::println);
    }

    public static void printMessage(){
        System.out.println("Hi There!");
    }
    private static void impl1() {
        Thread t = new Thread(() -> printMessage());
        t.start();
    }
    private static void impl2() {
        Thread t = new Thread(MethodReferences::printMessage);
        t.start();
    }
    private static void impl3() {
        List<Integer> ls = Arrays.asList(2,3,5);
        show(ls, System.out::println);

    }
    private static void impl4() {
        List<Integer> ls = Arrays.asList(6,7,8);
        show(ls, o -> System.out.println(o));

    }
    private static void show(List<Integer> ls, Consumer consumer){
        for(Integer I: ls){
            consumer.accept(I);
        }
    }
}

 class Job{
    String s;
    Job(String s){
        this.s=s;
    }
}