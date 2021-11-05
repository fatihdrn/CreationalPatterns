package com.fd.abstractFactory;

public class AbstractFactoryImpl implements AbstractFactory {
    @Override
    public Shapes getCube() {
        return new Cube();
    }

    @Override
    public Line getLine() {
        return new Dot();
    }
}
