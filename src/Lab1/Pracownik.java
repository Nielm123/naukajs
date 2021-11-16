package Lab1;

import java.io.Serializable;
import java.util.Date;

public class Pracownik implements Serializable {
    private String imie;
    private String nazwisko;
    private String adres;
    private String zawod;
    private Date data_urodzenia;

    public Pracownik(String imie, String nazwisko, String adres, String zawod, Date data_urodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.zawod = zawod;
        this.data_urodzenia = data_urodzenia;
    }

    @Override
    public String toString() {
        return "Pracownik- Imie: " + imie +
                ", Nazwisko: " + nazwisko +
                ", Adres: " + adres +
                ", Zawód: " + zawod +
                ", Data urodzenia: " + data_urodzenia;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public Date getdata_urodzenia() {
        return data_urodzenia;
    }

    public void setdata_urodzenia(Date data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }
}
