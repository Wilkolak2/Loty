import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem implements FlightReservationSystem{
    private List<Flight> loty;
    private List<Reservation> rezerwacje;

    public FlightBookingSystem(List<Flight> loty, List<Reservation> rezerwacje) {
        this.loty = new ArrayList<>();
        this.rezerwacje = new ArrayList<>();
    }

    @Override
    public void rezerwacjaLotu(Flight lot, String imie, String nazwisko, int cena) {
        if(lot.getLiczbaMiejsc() > 0){
            Reservation rezerwacja = new Reservation(lot,imie,nazwisko,cena);
            rezerwacje.add(rezerwacja);
            System.out.println("Rezerwacja dokonana");
        }
        else{
            System.out.println("Brak wolnych miesjsc");
        }
    }

    @Override
    public void anulowanieRezerwacji(Reservation rezerwacja) {
        rezerwacje.remove(rezerwacja);
        Flight lot = rezerwacja.getLot();
        lot.setLiczbaMiejsc(lot.getLiczbaMiejsc()+1);
        System.out.println("anulowano rezerwacje");
    }

    @Override
    public List<Flight> wyszukajLot(String miejsceDocelowe, String dataWylotu) {
        List<Flight> dostepneLoty = new ArrayList<>();
        for(Flight lot : loty){
            if(lot.getMiejsceDocelowe().equals(miejsceDocelowe) && lot.getDataWylotu().equals(dataWylotu)){
                System.out.println("-------------------------------------");
                System.out.println("Kierunek " + lot.getMiejsceDocelowe() + ", miejsce wylotu " + lot.getMiejsceWylotu() + ", data " + lot.getDataWylotu() +
                        ", czas trwania lotu " + lot.getCzasTrwania() + ", liczbaMiejsc " + lot.getLiczbaMiejsc());
                System.out.println("-------------------------------------");
            }
        }
        return dostepneLoty;
    }

    @Override
    public void dostepneLoty() {
        if(loty.isEmpty()){
            System.out.println("Brak dostępnych lotów");
        }
        else{
            System.out.println("Dostępne loty: ");
            for(Flight lot : loty){
                System.out.println("-------------------------------------");
                System.out.println("Kierunek " + lot.getMiejsceDocelowe() + ", miejsce wylotu " + lot.getMiejsceWylotu() + ", data " + lot.getDataWylotu() +
                        ", czas trwania lotu " + lot.getCzasTrwania() + ", liczbaMiejsc " + lot.getLiczbaMiejsc());
                System.out.println("-------------------------------------");
            }
        }
    }
    public void dodajLot(Flight lot){
        loty.add(lot);
        System.out.println("dodano lot");
    }
}
