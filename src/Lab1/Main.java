package Lab1;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Pracownik pracownik1 = new Pracownik("Piotr", "Malczewski", "Krakow", "Marynarz", new GregorianCalendar(1992, 3, 31).getTime());
        Pracownik pracownik2 = new Pracownik("Mariola", "Buond", "Kalisz", "Ekspedientka", new GregorianCalendar(2002, 5, 01).getTime());

        Kadry kadry = new Kadry();

        System.out.println("____________________________");

        kadry.dodaj_pracownika(pracownik1);
        kadry.dodaj_pracownika(pracownik2);

        System.out.println(kadry.toString());
        System.out.println("____________________________");

        kadry.aktualizuj_dane(0, "Wojciech", "Pała", "Poznań", "Grabarz", new GregorianCalendar(1989, 4, 14).getTime());

        System.out.println(pracownik1.toString());


        System.out.println("____________________________");
        System.out.println(kadry.pokaz_dane_pracownika(1));
        System.out.println("____________________________");

        kadry.wyswietl_po_imieniu("Bartosz");

        kadry.wyswietl_po_nazwisku("Kalamarz");

        kadry.wyswietl_po_zawodzie("Nauczyciel");

        System.out.println("____________________________");

        kadry.zapisz("zapis.bin", kadry);

        kadry.aktualizuj_dane(0, "Tadeusz", "Trębacz", "Trociny", "Tramwajarz", new GregorianCalendar(1996, 6, 16).getTime());

        System.out.println(kadry.odczytaj("zapis.bin").toString());
        System.out.println("____________________________");
        kadry.zapisz("zapis.bin", kadry);

        System.out.println(kadry.odczytaj("zapis.bin").toString());
    }
}