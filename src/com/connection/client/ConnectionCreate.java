/**
 * Created by Anonymous11100001 on 5/4/2016.
 */
package com.connection.client;
import com.connection.service.*;
import java.time.*;

public class ConnectionCreate {
    public static void main(String[] args){
        System.out.println("Test Connection System: ");

        for(int i = 1, j = 25; i < 7; i++, j++){
            ConnectionManager connectMan = ConnectionManager.creatConnection(new Connection("Connect" + Integer.toString(i), j), LocalTime.now());
        }
    }
}
