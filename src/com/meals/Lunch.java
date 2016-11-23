/**
 * Created by Anonymous11100001 on 5/4/2016.
 */
package com.meals;

class SoupVegetable{
    private SoupVegetable(){
        System.out.println("SoupVegetable Constructor");
    }
    public static SoupVegetable makeSoup(){
        return new SoupVegetable();
    }
}

class SoupMeat{
    private SoupMeat(){
        System.out.println("SoupMeat constructor");
    }
    private static SoupMeat sp1 = new SoupMeat();
    public static SoupMeat access(){
        return sp1;
    }
    public void f(){

    }
}

public class Lunch {
    public static void testPrivate(){
        //SoupVegetable spV = new SoupVegetable(); Error private constructor
    }
    public static void testStatic(){
        SoupVegetable.makeSoup();
    }
    public static void testSingleton(){
        SoupMeat.access().f();
    }
}
