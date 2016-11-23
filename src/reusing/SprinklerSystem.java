/**
 * Created by Anonymous11100001 on 5/5/2016.
 */
package reusing;

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString(){
        return
                        "valve1 = " + valve1 +
                        "valve2 = " + valve2 +
                        "valve3 = " + valve3 +
                        "valve4 = " + valve4 +
                        " i = " + i + "f = " + f +
                        "Source = " + source;
    }

    public static void main(String[] args){
        SprinklerSystem sprink = new SprinklerSystem();
        System.out.println(sprink);
    }
}
