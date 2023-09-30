package vb;

public class Locatie {
    private String id;
    private String beschrijving ;

    public Locatie(String id, String beschrijving) {
        this.id = id;
        this.beschrijving = beschrijving;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }
}
