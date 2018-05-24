package rs.aleph.android.example12.activities.activity.aktivites.model;

import java.util.ArrayList;

public class Sastojci {

    private int idSastojci;
    private String nazivSastojic;

    private Kategorija kategorija;


    public Sastojci(){


    }

    public Sastojci(int idSastojci, String nazivSastojic) {
        this.idSastojci = idSastojci;
        this.nazivSastojic = nazivSastojic;


    }

    public int getIdSastojci() {
        return idSastojci;
    }

    public void setIdSastojci(int idSastojci) {
        this.idSastojci = idSastojci;
    }

    public String getNazivSastojic() {
        return nazivSastojic;
    }

    public void setNazivSastojic(String nazivSastojic) {
        this.nazivSastojic = nazivSastojic;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    @Override
    public String toString() {
        return "Sastojci{" +
                "idSastojci=" + idSastojci +
                ", nazivSastojic='" + nazivSastojic + '\'' +
                '}';
    }
}
