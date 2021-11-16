package com.demo;

import java.time.LocalDate;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private String zawod;
    private LocalDate data_urodzenia;
    private int doswiadczenie;

    public Pracownik(String imie, String nazwisko, String zawod, LocalDate data_urodzenia, int doswiadczenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zawod = zawod;
        this.data_urodzenia = data_urodzenia;
        this.doswiadczenie = doswiadczenie;
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

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public LocalDate getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(LocalDate data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public int getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie +"\n"+ '\'' +
                ", nazwisko='" + nazwisko +"\n"+ '\'' +
                ", zawod='" + zawod +"\n"+ '\'' +
                ", data_urodzenia=" + data_urodzenia +"\n"+
                ", doswiadczenie=" + doswiadczenie +"\n"+
                '}';
    }
}
