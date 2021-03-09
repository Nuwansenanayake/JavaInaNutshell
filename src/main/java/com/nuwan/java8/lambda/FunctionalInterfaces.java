package com.nuwan.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args){
        imp1();
        imp2();
        imp3();
    }



    public static void imp1(){
        MyLambda greetingFunction = ()-> System.out.println("hello world 1");
        greetingFunction.foo();
    }
    interface MyLambda{
        void foo();
    }
    //sample 2
    public static void imp2(){
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Print all numbers: 2");
        eval(list,n->n%2==0);

    }


    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for(Integer n: list){
            if(predicate.test(n)){
                System.out.println(n+" ");
            }
        }
    }

    private static void imp3() {
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Print  numbers: 3");
        eval2(list,n->n%2==0, n->System.out.println(n+" ") );
    }
    public static void eval2(List<Integer> list, Predicate<Integer> predicate, Consumer consumer ){
        for(Integer n: list){
            if(predicate.test(n)){
                consumer.accept(n);
            }
        }
    }

}



