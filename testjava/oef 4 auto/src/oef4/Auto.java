package oef4;

public class Auto {
    private double km_teller,brandstoftank,verbruik,huidige_inhoud;

    public Auto(double huidige_inhoud,double verbruik) {
        km_teller =0;
        huidige_inhoud=0;
        this.verbruik = verbruik;
        this.huidige_inhoud = huidige_inhoud;
    }

    public Auto(double km_teller, double brandstoftank, double verbruik, double inhoud) {
        this.km_teller = km_teller;
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
        this.huidige_inhoud = huidige_inhoud;
    }
    public double rij(double km){
        km =Math.abs(km);
        double max = verbruik+huidige_inhoud;
        if (km < max){
            huidige_inhoud -= km+verbruik;
            return km;
        }else {
            huidige_inhoud= 0;
            return max;
        }
    }
    public void tank(){
        huidige_inhoud = brandstoftank;
    }
    public void print(){
        System.out.println("km teller"+km_teller+"\n" +"max liter:"+ brandstoftank + "\n"+"gebruik:"+verbruik+"\n"+"ik heb nog:"+ huidige_inhoud);
    }

    public static void main(String[] args) {
        Auto auto = new Auto(1200,6);
        auto.tank();
        auto.print();
        auto.rij(100);
        auto.print();
    }
}
