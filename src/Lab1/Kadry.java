package Lab1;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Kadry implements Serializable {

    private ArrayList<Pracownik> lista_pracownikow = new ArrayList<Pracownik>();

    public void dodaj_pracownika(Pracownik pracownik) {
        lista_pracownikow.add(pracownik);
    }

    public void usun_pracownika(Pracownik pracownik) {
        lista_pracownikow.remove(pracownik);
    }

    public ArrayList<Pracownik> getlista_pracownikow() {
        return lista_pracownikow;
    }

    public void setlista_pracownikow(ArrayList<Pracownik> lista_pracownikow) {
        this.lista_pracownikow = lista_pracownikow;
    }

    public void aktualizuj_dane(int index_pracownika, String imie, String nazwisko, String adres, String zawod, Date data_urodzenia) {
        lista_pracownikow.get(index_pracownika).setImie(imie);
        lista_pracownikow.get(index_pracownika).setNazwisko(nazwisko);
        lista_pracownikow.get(index_pracownika).setAdres(adres);
        lista_pracownikow.get(index_pracownika).setZawod(zawod);
        lista_pracownikow.get(index_pracownika).setdata_urodzenia(data_urodzenia);

    }

    public String pokaz_dane_pracownika(int index_pracownika) {
        return lista_pracownikow.get(index_pracownika).toString();
    }

    @Override
    public String toString() {
        return "Kadra: " +
                "Lista pracowników: " + lista_pracownikow;
    }

    public void wyswietl_po_imieniu(String imie) {
        for (int i = 0; i < lista_pracownikow.size(); i++) {
            if (lista_pracownikow.get(i).getImie() == imie) {
                System.out.println(lista_pracownikow.get(i).toString());
                break;
            }
        }
    }

    public void wyswietl_po_nazwisku(String nazwisko) {
        for (int i = 0; i < lista_pracownikow.size(); i++) {
            if (lista_pracownikow.get(i).getNazwisko() == nazwisko) {
                System.out.println(lista_pracownikow.get(i).toString());
            }
        }
    }

    public void wyswietl_po_zawodzie(String zawod) {
        for (int i = 0; i < lista_pracownikow.size(); i++) {
            if (lista_pracownikow.get(i).getZawod() == zawod) {
                System.out.println(lista_pracownikow.get(i).toString());
            }
        }
    }

    public void zapisz(String nazwa, Kadry kadry) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream(nazwa);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(kadry);
        oos.flush();
        oos.close();
    }

    public Kadry odczytaj(String nazwa) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(nazwa);
        ObjectInputStream oin = new ObjectInputStream(fis);
        Kadry obiekty = (Kadry) oin.readObject();

        oin.close();

        return obiekty;
    }
}