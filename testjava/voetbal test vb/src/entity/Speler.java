package entity;

public class Speler {
    private String naam;
    private int leeftijd;
    public Speler(String naam, int leeftijd){
        this.naam = naam;
        this.leeftijd = leeftijd;
    }
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void printgegevens(){
        System.out.println("naam: " + naam);
        System.out.println("leeftijd: " + leeftijd);
    }
}
