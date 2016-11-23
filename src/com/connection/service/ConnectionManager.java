/**
 * Created by Anonymous11100001 on 5/4/2016.
 */
package com.connection.service;
import java.time.*;

public class ConnectionManager {
    private static Connection[] arrConnect = new Connection[5];
    private Connection connect;
    private LocalTime timeNow = LocalTime.now();
    private static int count = 0;

    private ConnectionManager(Connection connect, LocalTime timeNow){
        this.connect = connect;
        this.timeNow = timeNow;
        System.out.println("New Connection has created !");
        System.out.println("The time which object created is: " + timeNow);
    }

    public static ConnectionManager creatConnection(Connection connect, LocalTime timeNow){
        if(count >= arrConnect.length){
            System.out.println("Sorry the Object connect have not created because it exceed bound array !!!!");
            return null;
        }else{
            arrConnect[count] = connect;
            count++;
            System.out.println("The number Connection count = " + count);
            return new ConnectionManager(connect, timeNow);
        }
    }
}
