package dziedziczenie;

//Nowa klasa określająca markę pojazdu
public class Pojazd {

    private String marka;
    private String rocznik;
    private String naped;

    public Pojazd() {
        marka = "";
        rocznik = "";
        naped = "";
    }
// cmd+n
    public Pojazd(final String marka, final String rocznik, final String naped){
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;

    }

    public String toString(){
        return " Marka: " + this.marka
                + " rocznik: " + this.rocznik
                + " napęd: " + this.naped;
    }
    // Gettery - Metody których zadaniem jest pbieranie informacji z pol klasy
    // do dalszego przetwarzania

    public String getMarka() {
        return marka;
    }

    public String getRocznik() {
        return rocznik;
    }
    public String getNapęd() {
        return naped;
    }
}