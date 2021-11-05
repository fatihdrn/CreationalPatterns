package com.fd.factory;

public class BmwFactory extends ArabaFactory {

    @Override
    public void createAraba() {
        getArabaList().add(new Bmw320("BMW","320",5));
    }
}
