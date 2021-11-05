package com.fd.factoryMethod;

public class Pdf implements Document{
    @Override
    public String documentType() {
        return "PDF";
    }
}
