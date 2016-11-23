/**
 * Created by Anonymous11100001 on 5/6/2016.
 */
import static tk.anonymous11100001.util.Print.*;

class Engine{
    private String s;
    Engine(){
        print("Engine()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}

public class AirPlane {
    private String fulselage, wings, tail;
    private Engine e;
    public AirPlane(){
        print("Insides AirPlane() Constructor");
        fulselage = "Body";
        wings = "Airfoils";
        tail = "Empennage";
    }
    public String toString(){
        if(e == null){
            e = new Engine();
        }
        return
                "fulselage = " + fulselage +
                        " wings = " + wings +
                        " tail = " + tail +
                        " Engine = " + e;
    }
    public static void main(String[] args){
        AirPlane arj = new AirPlane();
        print(arj);
    }
}
