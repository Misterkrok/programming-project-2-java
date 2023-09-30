package vb;

public class Dier {
    private String naam;
    private int leeftijd;
    private Locatie locatie;
    private String locatie_beschrijving

    public Dier(String naam, int leeftijd, String locatie_beschrijving) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.locatie_beschrijving = locatie_beschrijving;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }


    public String getLocatie_beschrijving() {
        return locatie_beschrijving;
    }

    public void setLocatie_beschrijving(String locatie_beschrijving) {
        this.locatie_beschrijving = locatie_beschrijving;
    }
}
