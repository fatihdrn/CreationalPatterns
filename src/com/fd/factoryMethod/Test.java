package com.fd.factoryMethod;

public class Test {
    public static void main(String[] args) {
       try{
          Pdf pdf= (Pdf) DocumentFactory.createDocument(Pdf.class);
         System.out.println( pdf.documentType());
          Word word= (Word) DocumentFactory.createDocument(Word.class);
           System.out.println( word.documentType());
       }
       catch (Exception e){
           e.getCause();
       }
    }
}
