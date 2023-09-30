package oef1;

public class Persoon {

    private String voornaam,achternaam,telephoonnummer;
    private Adres adres;
    private static int teller=0;

    public Persoon(){
        teller++;
    }


    public Persoon(String voornaam, String achternaam, String telephoonnummer, Adres adres) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.telephoonnummer = telephoonnummer;
        this.adres = adres;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTelephoonnummer() {
        return telephoonnummer;
    }

    public void setTelephoonnummer(String telephoonnummer) {
        this.telephoonnummer = telephoonnummer;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public static void main(String[] args) {
        Persoon p= new Persoon("jos","joskens",new Adres("straat","13","8",1730,"Asse"));
        System.out.println(p.adres);
    }
}
