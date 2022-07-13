package dziedziczenie;

//extends - słowo kluczowe stosowane rpzy dziedziczeniu klas
//super - słowo kluczowe stosowane przy dziedziczeniu odnosisię d konstruktora klasy nadrzędnej
public class Model {
    private final String nazwa;
    private final Integer przebieg;
    private final Integer pojemnoscSilnika;
    private final Kolor kolor;

    public Model(
            final String marka, final  String rocznik,
            final String naped, final String nazwa,
            final Integer przebieg,
            final Double pojemnoscSilnika,
            final Kolor kolor) {

        super(marka, rocznik, naped);
        this.nazwa = "";
       this.przebieg - 0;
       this.pojemnoscSilnika = 0.0;
      this.kolor =
    }
    @0verride //adnotacja wykorzystywana doprzesyłania metod
    public String toString() {
        return "Marka: " + getMarka()
                + "rocznik: " + getRocznik()
                + "naped : " + getNaped()
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
        public Kolor getKolor() {
        return nazwa;
        }
}
