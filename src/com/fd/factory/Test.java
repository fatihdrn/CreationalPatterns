package com.fd.factory;

public class Test {
    public static void main(String[] args) {
        ArabaFactory audi=new AudiFactroy();
        ArabaFactory bmw=new BmwFactory();
        for(Araba aa:audi.getArabaList()){
            System.out.println(aa.getMarka()+""+aa.getModel()+""+aa.getYas());
        }
    }
}
