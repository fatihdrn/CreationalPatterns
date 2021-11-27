package com.fd.builder;

public class FluentBuilder {

    private Marka marka;
    private Model model;
    private int beygirGucu;
    private String renk;

    public static FluentBuilder builder(){
        return new FluentBuilder();
    }

    public FluentBuilder withModel(final Model model){
        this.model=model;
        return this;
    }
    public FluentBuilder withMarka(final Marka marka){
        this.marka=marka;
        return this;
    }
    public FluentBuilder withBeygirGucu(final int beygirGucu){
        this.beygirGucu=beygirGucu;
        return this;
    }
    public FluentBuilder withRenk(final String renk){
        this.renk=renk;
        return this;
    }

    public Araba build() {
        final Araba araba = new Araba();
        araba.setMarka(marka);
        araba.setModel(model);
        araba.setRenk(renk);
        araba.setBeygirGucu(beygirGucu);
        return araba;
    }
    public static void main(String[] args) {
       Araba araba=FluentBuilder.builder().withBeygirGucu(10).withMarka(new Marka("marka")).build();
       System.out.println(araba.getBeygirGucu()+"/"+araba.getMarka().toString());
    }



}
