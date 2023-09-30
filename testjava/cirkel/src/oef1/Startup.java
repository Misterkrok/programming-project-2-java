package oef1;

public class Startup {

    public static void main(String[] args) {
        Cirkel whitecirkel = new Cirkel();
        whitecirkel.setKleuren("groen");
        whitecirkel.setKleuren("rood");
        System.out.println(whitecirkel.getKleuren());
        whitecirkel.setStraal(2.99);
        System.out.println(whitecirkel.opp());
    }
}
