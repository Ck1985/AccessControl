/**
 * Created by Anonymous11100001 on 5/3/2016.
 */
package tk.anonymous11100001.subContaner;

import tk.anonymous11100001.contaner.Fruit;

import java.time.*;

public class Banana extends Fruit{
    public Banana(){
        System.out.println("Banana default Constructor");
    }

    public Banana(String nameBanana, String dateExpireBanana){
        nameFruit = nameBanana;
        dateExpire = dateExpireBanana;
    }

    public LocalDate showDate(){
        return showExpireDate();
    }
}
