package com.fd.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Computer a=new Computer("casper",2l,"laptop");
        Computer a2= (Computer) a.clone();
        a2.setId(3l);
        a2.setName("msi");
        System.out.println(a.toString());
        System.out.println(a2.toString());


    }
}
