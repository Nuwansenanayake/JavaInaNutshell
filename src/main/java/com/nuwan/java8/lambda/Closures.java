package com.nuwan.java8.lambda;

public class Closures {
    public static void main(String[] args) {

        imp1();
        imp2();
    }

    private static void imp2() {
        int a=10;
        int b=20;
        operate(a, new Calculator() {
            @Override
            public void process(int i) {
                System.out.println(i + " - " + b);
            }
        });

    }

    private static void imp1() {
        int a=10;
        int b=20;
        operate(a, (i) -> {
            System.out.println(i + " - " + b);
        });
    }

    public static void operate(int i, Calculator calculator){

        calculator.process(i);
    }

    interface Calculator{
        void process(int i);
    }
}
