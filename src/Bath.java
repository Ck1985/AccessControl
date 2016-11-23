/**
 * Created by Anonymous11100001 on 5/5/2016.
 */
import static tk.anonymous11100001.util.Print.*;

public class Bath {
    private String s1 = "Happy",
                   s2 = "Happy",
                   s3,
                   s4;
    private Soap casttile;
    private int i;
    private float toy;

    public Bath() {
        print("Insidea Bath()");
        s3 = "Joy";
        toy = 4.14f;
        casttile = new Soap();
    }
    {
        i = 47;
    }

    public String toString(){
        if(s4 == null){
            s4 = "Joy";
        }
        return
                "s1 = " + s1 + '\n' +
                        "s2 = " + s2 + '\n' +
                        "s3 = " + s3 + '\n' +
                        "s4 = " + s4 + '\n' +
                        "i = " + i + '\n' +
                        "toy = " + toy + '\n' +
                        "casttile = " + casttile;
    }

    public static void main(String[] args){
        Bath b = new Bath();
        print(b);
    }
}

class Soap{
    private String s;
    Soap(){
        print("Soap() Constructor");
        s = "Created !";
    }
    public String toString(){
        return s;
    }
}
