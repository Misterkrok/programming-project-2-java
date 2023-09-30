package oef1;

public class Cirkel {
    private double straal =0;
    private String kleuren = "wit";

    public Cirkel() {
        this.straal = 0;
        this.kleuren = "wit";
    }
    public Cirkel(double straal) {
        this.straal = straal;
    }

    public Cirkel(String kleuren) {
        this.setKleuren(kleuren);
    }

    public Cirkel(double straal, String kleuren) {
        this.straal = straal;
        this.setKleuren(kleuren);
    }

    public double getStraal() {
        return this.straal;
    }

    public String getKleuren() {
        return kleuren;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }
    public void setKleuren(String kleuren){
        if (kleuren == "wit" || kleuren == "rood"|| kleuren == "geel")
        {this.kleuren = kleuren;}else
        {System.err.println();}
    }

    public double omtrek(){
        return 2*Math.PI * this.straal;
    }
    public double opp(){
        return  Math.PI * this.straal * this.straal;
    }
}