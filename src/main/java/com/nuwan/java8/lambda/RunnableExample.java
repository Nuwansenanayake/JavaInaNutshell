package com.nuwan.java8.lambda;

public class RunnableExample {
    public static void main(String[] args){
        nolambda();
        withlambda();
    }


    private static void nolambda() {
        Thread myThread= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printed inside runnable");
            }
        });
        myThread.run();
    }

    private static void withlambda() {
        //only for interfaces with one method
        Thread myThread = new Thread(()->System.out.println("printed inside lambda runnable"));
        myThread.run();

    }

}
