package com.fd.prototype;

public class Computer extends Product {
    private String type;

    public Computer(String name,Long id,String type) {
        setId(id);
        setName(name);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "model='" + getType() + '\'' +"name="+getName() + '\''+
                '}';
    }
}
