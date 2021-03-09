package com.nuwan.designpatterns.builder;

public class LombokBuilderDemo1Test {
    public static void main(String[] args){
        LombokBuilderDemo1 lombokBuilderDemo1 = LombokBuilderDemo1.builder()
                .name("Nuwan")
                .id(2)
                .build();
        System.out.println(lombokBuilderDemo1.getId());
        System.out.println(lombokBuilderDemo1.getName());
    }
}
