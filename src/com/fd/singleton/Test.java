package com.fd.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonObject sO=SingletonObject.getSingleObject();
        SingletonObject sO1=SingletonObject.getSingleObject();

        System.out.println(sO);
        System.out.println(sO1);
        if(sO==sO1){
            System.out.println("equals");

        }
        else{
            System.out.println("not equals");
        }
    }
}
