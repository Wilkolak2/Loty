import java.util.List;

public interface FlightReservationSystem {
    void rezerwacjaLotu(Flight lot,String imie, String nazwisko, int cena);
    void anulowanieRezerwacji(Reservation rezerwacja);
    List<Flight> wyszukajLot(String miejsceDocelowe, String dataWylotu);
    void dostepneLoty();
}
