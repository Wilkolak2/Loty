public class Reservation {
    private Flight lot;
    private String imie;
    private String nazwisko;
    private int cena;
    public Reservation(Flight lot, String imie, String nazwisko, int cena) {
        this.lot = lot;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.cena = cena;
        lot.setLiczbaMiejsc(lot.getLiczbaMiejsc() - 1);
    }

    public Flight getLot() {
        return lot;
    }

    public void setLot(Flight lot) {
        this.lot = lot;
    }
}
