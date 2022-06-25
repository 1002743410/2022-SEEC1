//import sun.font.DelegatingShape;

public class Battery {

    //add the attributes for class Battery
    double electric;
    double PowerEfficiency=getConsumptionReate();
    double ChargeEfficiency=getProductionReate();

    //No Parameter Constructor
    //set the attributes with default value
    public Battery(){

    }

    public Battery(double cRate,double rRate){
        ChargeEfficiency=cRate;
        PowerEfficiency=rRate;
    }

    public double getConsumptionReate(){
        return 0.1;

    }

    public double getProductionReate(){
        return 0.2;
    }


    //冲 p 电量
    //charge power which amount is p
    public void chargeBattery(double p){
        if (electric+p>1){
            electric=1;
        }else {
            electric=electric+p;
        }

    }
    //如果剩余电量》=p，使用 p电量，返回true，否则剩余电量=0，返回false
    //if the remaining power amount is larger than p, consume the p power and return true;
    //else the remaining power become 0 and return false;
    public boolean useBattery(double p){
        if (electric>=p){
            electric=electric-p;
            return true;
        }else {
            electric=0;
            return false;
        }
    }

}
