package com.fd.builder;

public class SiparisMaker {
    private SiparisBuilder siparisBuilder;

    public Araba createOrder(final String marka,final String model,final int beygirGucu,final String renk){
        if(marka=="Ford"){
            siparisBuilder=new FordSiparisBuilder();
            siparisBuilder.setMarka(marka);
            siparisBuilder.setModel(model);
            siparisBuilder.setBeygirGucu(beygirGucu);
            siparisBuilder.setRenk(renk);

        }
        printOrder();
        return siparisBuilder.getAraba();
    }
    public void printOrder() {
        System.out.println("Marka: " + siparisBuilder.getAraba().getMarka());
        System.out.println("Model: " + siparisBuilder.getAraba().getModel());
        System.out.println("Renk: " + siparisBuilder.getAraba().getRenk());
        System.out.println("Beygirgücğ: " +
                siparisBuilder.getAraba().getBeygirGucu());
    }
}
