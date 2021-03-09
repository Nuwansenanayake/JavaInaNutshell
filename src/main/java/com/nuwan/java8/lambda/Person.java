package com.nuwan.java8.lambda;

public class Person{
    String name;
    int age;
    Person(String name, int age){
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString(){
        return name +"'s age is " + age;
    }
}
