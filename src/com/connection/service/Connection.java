/**
 * Created by Anonymous11100001 on 5/4/2016.
 */
package com.connection.service;

public class Connection {
    private String nameConnect;
    private int mount;

    public Connection(String nameConnect, int mount){
        this.nameConnect = nameConnect;
        this.mount = mount;
        System.out.println("The Connection object " + this.nameConnect + " has mount = " + this.mount);
    }
}
