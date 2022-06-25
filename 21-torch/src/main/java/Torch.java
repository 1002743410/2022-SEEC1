import java.util.concurrent.atomic.AtomicReference;

public class Torch {
    //add attibutes for torch
    Battery batter;

    public Torch(Battery battery) {
        batter=battery;
        //add code here
    }

    /**
     * 10% power consumption per hour for using a torch
     * return true if enough power
     * return false if battery cannot support for the specified hours
     */
    public boolean turnOn(int hours){
        return batter.useBattery(hours* batter.PowerEfficiency);
        //add code here
    }
    /**
     * 20% power production per hour for charging the battery
     */
    public void charge(int hours){
        batter.chargeBattery(hours* batter.ChargeEfficiency);

        //add code here
    }

}
