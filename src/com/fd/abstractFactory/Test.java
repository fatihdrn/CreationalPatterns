package com.fd.abstractFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new AbstractFactoryImpl();
        Shapes shape=abstractFactory.getCube();
         shape.show();
         Line line=abstractFactory.getLine();
         line.show();
    }
}
