package com.nuwan.java8.lambda;

public class LambdaExpressions {
    public static void main(String[] args){
        Calculator addCal=(a, b) -> a+b;
        Calculator subCal=(a, b) -> a-b;
        System.out.println(addCal.opertion(10,20));
        System.out.println(subCal.opertion(20,30));
    }

    interface Calculator{
        int opertion(int a, int b);
    }
}
