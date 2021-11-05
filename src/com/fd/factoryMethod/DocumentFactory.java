package com.fd.factoryMethod;

public class DocumentFactory {
    public static Document createDocument(Class cls) throws IllegalAccessException, InstantiationException {
       return (Document) cls.newInstance();
    }
}
