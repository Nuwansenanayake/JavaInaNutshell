package com.nuwan.designpatterns.builder;

public class JavaBuilderDemo1Test {
    public static void main(String[] args){
//        JavaBuilderDemo1 df=new JavaBuilderDemo1(2,"dsd");
        JavaBuilderDemo1 lombokBuilderDemo1 = JavaBuilderDemo1.builder()
                .name("Nuwan")
                .id(2)
                .build();
        System.out.println(lombokBuilderDemo1.getId());
        System.out.println(lombokBuilderDemo1.getName());
    }
}
