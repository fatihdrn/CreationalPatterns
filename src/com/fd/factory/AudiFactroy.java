package com.fd.factory;

public class AudiFactroy extends ArabaFactory {

    @Override
    public void createAraba() {
      getArabaList().add(new AudiRs6("Audi","Rs6",4));
    }
}
