package com.nuwan.java8.lambda;

public class TypeInference {
    public static void main(String[] args){
        StringLengthLambda myLambda = (String s)->s.length();
        StringLengthLambda myLambda1 = (s)->s.length();
        StringLengthLambda myLambda2 = s->s.length();


        System.out.println(myLambda.getLength("Hello Sri Lanka"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
