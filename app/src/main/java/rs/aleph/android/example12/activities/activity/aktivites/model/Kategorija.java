package rs.aleph.android.example12.activities.activity.aktivites.model;

import java.util.ArrayList;

public class Kategorija {

    private int idKategorije;
    private String nazivKategorije;

    private Jelo jelo;
    private Sastojci sastojci;
    public ArrayList<Sastojci> sastojici;

    public Kategorija(){
        sastojici = new ArrayList<Sastojci>();
    }
    public Kategorija(int idKategorije, String nazivKategorije) {
        this.idKategorije = idKategorije;
        this.nazivKategorije = nazivKategorije;
        sastojici = new ArrayList<Sastojci>();
    }

    public int getId() {
        return idKategorije;
    }

    public void setId(int idKategorije) {
        this.idKategorije = idKategorije;
    }

    public String getNazivKategorije() {
        return nazivKategorije;
    }

    public void setNazivKategorije(String nazivKategorije) {
        this.nazivKategorije = nazivKategorije;
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }

    public Sastojci getSastojci() {
        return sastojci;
    }

    public void setSastojci(Sastojci sastojci) {
        this.sastojci = sastojci;
    }

    public ArrayList<Sastojci> getSastojici() {
        return sastojici;
    }

    public void setSastojici(ArrayList<Sastojci> sastojici) {
        this.sastojici = sastojici;
    }

    @Override
    public String toString() {
        return "Kategorija{" +
                "id=" + idKategorije +
                ", nazivKategorije='" + nazivKategorije + '\'' +
                '}';
    }
}
