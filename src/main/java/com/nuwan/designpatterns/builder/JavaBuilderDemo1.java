package com.nuwan.designpatterns.builder;

public class JavaBuilderDemo1 {

    private int id;public int getId() {
        return id;
    }
    private String name;public String getName() {
        return name;
    }

    private JavaBuilderDemo1(final int id, final String name) {
        this.id = id; this.name = name;
    }

    public static JavaBuilderDemo1.JavaBuilderDemo1Builder builder(){
        return new JavaBuilderDemo1.JavaBuilderDemo1Builder();
    }

    public static class JavaBuilderDemo1Builder{
        private int id;
        private String name;

        JavaBuilderDemo1Builder (){ }

        public JavaBuilderDemo1.JavaBuilderDemo1Builder id(final int id){
            this.id=id;
            return this;
        }
        public JavaBuilderDemo1.JavaBuilderDemo1Builder name(final String name){
            this.name=name;
            return this;
        }
        public JavaBuilderDemo1 build(){
            return new JavaBuilderDemo1(this.id,this.name);
        }


    }


}
