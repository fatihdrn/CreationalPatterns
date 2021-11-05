package com.fd.factory;

public abstract class Araba {
    private String marka;
    private String model;
    private int yas;

    public Araba(String marka, String model, int yas) {
        this.marka = marka;
        this.model = model;
        this.yas = yas;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
