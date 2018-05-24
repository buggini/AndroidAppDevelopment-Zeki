package rs.aleph.android.example12.activities.activity.aktivites.model;

import java.util.ArrayList;

public class Jelo {

    private int id;
    private String slika;
    private String naziv;
    private String opis;
    private int klVresnost;
    private double cena;

    public ArrayList<Kategorija> kategorija;

    public Jelo(){

        kategorija = new ArrayList<Kategorija>();

    }

    public Jelo(int id, String slika, String naziv, String opis, int klVresnost, double cena) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.opis = opis;
        this.klVresnost = klVresnost;
        this.cena = cena;

        kategorija = new ArrayList<Kategorija>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getKlVresnost() {
        return klVresnost;
    }

    public void setKlVresnost(int klVresnost) {
        this.klVresnost = klVresnost;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public ArrayList<Kategorija> getKategorija() {
        return kategorija;
    }

    public void setKategorija(ArrayList<Kategorija> kategorija) {
        this.kategorija = kategorija;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", slika='" + slika + '\'' +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", klVresnost=" + klVresnost +
                ", cena=" + cena +
                '}';
    }
}
