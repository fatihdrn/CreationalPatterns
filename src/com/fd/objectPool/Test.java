package com.fd.objectPool;

public class Test {

    public static void main(String[] args) {
        Connection con1=DataSource.getConnection();
        Connection con2=DataSource.getConnection();
        Connection con3=DataSource.getConnection();
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(con3);
    }
}
