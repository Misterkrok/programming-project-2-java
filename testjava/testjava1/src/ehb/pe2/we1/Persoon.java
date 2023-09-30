package ehb.pe2.we1;

public class Persoon {
    private int leeftijd;
    private static int teller;
    private String naam;

    public static void main(String[] args){
        Persoon p = new Persoon();
        System.out.println(Persoon.teller);
    }
}
