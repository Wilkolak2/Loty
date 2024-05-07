import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Flight> loty = new ArrayList<>();
        List<Reservation> rezerwacje = new ArrayList<>();
        Flight lot1 = new Flight("Madryt","Polska","06-06-2024",120,200);
        Reservation rezerwacja1 = new Reservation(lot1,"Jan","Nowak",200);
        FlightBookingSystem rezerwoanieLotu = new FlightBookingSystem(loty,rezerwacje);

        //dodawanie lotów
        rezerwoanieLotu.dodajLot(new Flight("Paryż","Polska","05-05-2024",120,150));
        rezerwoanieLotu.dodajLot(new Flight("Berlin","Polska","05-05-2024",60,100));

        //wyświetlanie dostępnych lotów
        rezerwoanieLotu.dostepneLoty();

        //anulowanie rezerwacji
        rezerwoanieLotu.anulowanieRezerwacji(rezerwacja1);

        //wyświetlanie dostępnyh lotów poprzez miejsce i date
        List<Flight> dostepneLoty = rezerwoanieLotu.wyszukajLot("Paryż","05-05-2024");

        //rezerwacja lotu
        rezerwoanieLotu.rezerwacjaLotu(lot1,"Jan","Nowak",100);


    }
}