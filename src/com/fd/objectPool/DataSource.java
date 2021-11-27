package com.fd.objectPool;

import com.fd.abstractFactory.Line;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    static DataSource dataSource=new DataSource();
    List<Connection> connections=new ArrayList<Connection>();

    private DataSource(){
        init();
    }
    private void init(){

        for (int i = 0; i <4 ; i++) {
            connections.add(new Connection());
        }
    }
    static Connection getConnection(){
        if(dataSource.connections==null){
            System.out.println("no connection");
        }
        Connection con=dataSource.connections.get(0);
        dataSource.connections.remove(0);
        return con;
    }
    static void releaseCon(Connection connection){
        if(connection!=null)
        dataSource.connections.add(connection);
    }
}
