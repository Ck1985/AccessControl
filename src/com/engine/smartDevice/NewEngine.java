/**
 * Created by Anonymous11100001 on 5/3/2016.
 */
package com.engine.smartDevice;
import static  tk.anonymous11100001.util.Print.*;

public class NewEngine extends OldEngine {
    public static void main(String[] args){
        NewEngine objNew = new NewEngine();
        EngineSource objSource = new EngineSource("Samsung", 'f', 45);
        print(objSource.torrentEngine);
        print(objSource.engineExtends);
        print(objSource.normalEngine);

        print(objNew.name);
        print(objNew.symbol);
        print(objNew.years);
    }
}
