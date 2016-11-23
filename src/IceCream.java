/**
 * Created by Anonymous11100001 on 5/2/2016.
 */
class Sundae{
    private Sundae(){

    }
    static Sundae makeSundae(){
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args){
        //Sundae obj = new Sundae(); Error Sundae Constructor has private access so it can not instance from out side
        Sundae.makeSundae();
    }
}
