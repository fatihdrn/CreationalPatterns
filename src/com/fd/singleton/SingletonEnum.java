package com.fd.singleton;

public enum SingletonEnum {
      DOLAR(15),EURO(10);
    private int type;
    SingletonEnum(int type){
          this.type=type;
    }
    SingletonEnum(){

    }
    public int gett(){
        return type;
    }
}
