package dziedziczenie;

import java.util.concurrent.atomic.AtomicMarkableReference;

//extends - słowo kluczowe stosowane rpzy dziedziczeniu klas
//super - słowo kluczowe stosowane przy dziedziczeniu odnosisię d konstruktora klasy nadrzędnej
public class Model extends Pojazd {
    private final String nazwa;
    private final Integer przebieg;

    private final String naped; //ja to dodałam
    private final Double pojemnoscSilnika;
    private final Kolor kolor;

    public Model(String nazwa, Integer przebieg, Double pojemnoscSilnika, Kolor kolor) {
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.naped = naped;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }

    public Model(String marka, String rocznik, String naped, String nazwa, Integer przebieg, Double pojemnoscSilnika, Kolor kolor) {
        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.naped = naped;
        this.kolor = kolor;
    }

    public Model() {

    }

    public String toString() {
        return "Marka: " + getMarka()
                + "rocznik: " + getRocznik()
                + "naped : " + getNapęd()
                + " nazwa modelu: " + this.nazwa
                + " przebieg: " + this.przebieg
                + " pojemnoscSilnika: " + this.pojemnoscSilnika
                + "kolor: " + this.kolor;
    }

    public Double getPojemnoscSilnika() {

        return pojemnoscSilnika;
    }

    public Integer getPrzebieg() {

        return przebieg;
    }

    public String getNazwa() {

        return nazwa;
    }

    public Integer getPrzebieg() {
        return przebieg;
    }

    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public Kolor getKolor() {
        return kolor;
    }
    public void setKolor(final Kolor kolor) {
        this.kolor = kolor;
    }

    public void setNazwa(String Nazwa) {
        this.nazwa = nazwa;
    }

    public void setPrzebieg(final Integer przebieg);
        this.przebieg =przebieg;

    public String getNaped() {
        return naped;
    }

    public void setNaped(String przód) {
    }
}
}
