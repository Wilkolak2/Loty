import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
    private String miejsceDocelowe;
    private String miejsceWylotu;
    private String dataWylotu;
    private int czasTrwania;
    private int liczbaMiejsc;

    public Flight(String miejsceDocelowe, String miejsceWylotu, String dataWylotu, int czasTrwania, int liczbaMiejsc) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.miejsceWylotu = miejsceWylotu;
        this.dataWylotu = dataWylotu;
        this.czasTrwania = czasTrwania;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    public void setMiejsceDocelowe(String miejsceDocelowe) {
        this.miejsceDocelowe = miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return miejsceWylotu;
    }

    public void setMiejsceWylotu(String miejsceWylotu) {
        this.miejsceWylotu = miejsceWylotu;
    }

    public String getDataWylotu() {
        return dataWylotu;
    }

    public void setDataWylotu(String dataWylotu) {
        this.dataWylotu = dataWylotu;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }
}
