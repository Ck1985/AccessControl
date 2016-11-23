/**
 * Created by Anonymous11100001 on 5/3/2016.
 */
package tk.anonymous11100001.contaner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;


public class Fruit {
    protected String nameFruit;
    protected String dateExpire;

    public Fruit(){
        System.out.println("Fruit Constructor");
    }

    public Fruit(String nameFruit, String dateExpire){
        this.nameFruit = nameFruit;
        this.dateExpire = dateExpire;
    }

    protected LocalDate showExpireDate(){
        System.out.println("The Expire date of this fruit is: ");
        LocalDate date = LocalDate.parse(dateExpire, DateTimeFormatter.BASIC_ISO_DATE);
        return date;
    }

    public static void main(String[] args){

    }
}
