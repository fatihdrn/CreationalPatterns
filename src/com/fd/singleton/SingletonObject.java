package com.fd.singleton;

public class SingletonObject {

    private static SingletonObject sObject;

    private SingletonObject(){

    }

    public static SingletonObject getSingleObject(){
        if(sObject==null){
            sObject=new SingletonObject();
        }

        return sObject;

    }
}
