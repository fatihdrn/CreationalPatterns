package com.fd.factoryMethod;

public class Word implements Document {
    @Override
    public String documentType() {
        return "WORD";
    }
}
