/**
 * Created by Anonymous11100001 on 5/3/2016.
 */
package com.engine.extendsSystem;
import static tk.anonymous11100001.util.Print.*;
import com.engine.smartDevice.EngineSource;

public class SubEngine extends EngineSource {
    public static void main(String[] args){
        EngineSource objSource = new EngineSource("Merc", "Merc2008", 7.34f);
        SubEngine subObj = new SubEngine();
        print(subObj.engineExtends);
        print(subObj.symbolModuel);
    }
}
