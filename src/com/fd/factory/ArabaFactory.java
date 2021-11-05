package com.fd.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class ArabaFactory {
    private List<Araba> arabaList=new ArrayList<Araba>();

    public ArabaFactory(){
      createAraba();
    }

    public abstract void createAraba();

    public List<Araba> getArabaList() { return arabaList; }

    public void setArabaList( final List<Araba> arabaList) { this.arabaList = arabaList; }
}
