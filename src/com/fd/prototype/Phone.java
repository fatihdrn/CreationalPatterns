package com.fd.prototype;

public class Phone extends Product {

    private String model;

    public Phone(String model,String name,Long id){
        setModel(model);
        setId(id);
        setName(name);
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +"name="+getName() + '\''+
                '}';
    }
}
