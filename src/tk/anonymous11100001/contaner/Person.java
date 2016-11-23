/**
 * Created by Anonymous11100001 on 5/3/2016.
 */
package tk.anonymous11100001.contaner;

public class Person {
    public static void main(String[] args){
        Fruit objFruit = new Fruit("Banana", "20180926");
        //Protected method have package access but not public:
        System.out.println("Name of fruit is: " + objFruit.nameFruit + objFruit.showExpireDate());
    }
}
