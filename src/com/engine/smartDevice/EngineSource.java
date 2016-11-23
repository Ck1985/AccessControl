/**
 * Created by Anonymous11100001 on 5/3/2016.
 */
package com.engine.smartDevice;
import tk.anonymous11100001.util.*;

public class EngineSource {
    private String engineSystem;
    protected String engineExtends;
    public String normalEngine = "Cheap System";
    String torrentEngine;
    
    private float informationSource;
    public int yearProduce;
    protected char symbolModuel = 'w';
    int compatibilityNumber = 8;
    public int rate;
    
    public EngineSource(){
        Print.print("Overview Information of System");
    }
    public EngineSource(String engineSystem, String engineExtends, float informationSource){
        this.engineSystem = engineSystem;
        this.engineExtends = engineExtends;
        this.informationSource = informationSource;
        Print.print("the second Constructor");
    }
    public EngineSource(String normalEngine, char symbolModuel, int rate){
        this("Vertu", "Vertuver1", 53.8f);
        this.normalEngine = normalEngine;
        this.symbolModuel = symbolModuel;
        this.rate = rate;
        Print.print("The third Constructor");
    }

    protected void getInformationExtends(){
        Print.print("Information of Extends engine:");
        Print.print("Engine extends: " + this.engineExtends);
        Print.print("Engine symbol extends: " + this.symbolModuel);
    }

    public void getInformationNormal(){
        Print.print("Normal System: " + this.normalEngine);
        Print.print("Compatibility engine: " + this.compatibilityNumber);
    }
}
