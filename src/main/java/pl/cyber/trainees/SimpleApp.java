package pl.cyber.trainees;

import pl.cyber.dziedziczenie.Kolor;
import pl.cyber.dziedziczenie.Model;

import java.util.ArrayList;

public class SimpleApp {

    public static void main(String[] args) {

        //Ctrl + P - podpowiadanie w użyciu metod/ deklaracji Objektów dostępnych parametrów

        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020",
                "przód", "Passat", 10000,
                2.0,  Kolor.ZIELONY);
        var modelPojazdu3 = new Model("VW", "2000",
                "przód", "Passat", 300000,
                2.0,  Kolor.valueOf("NIEBIESKI"));

        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setPojemnoscSilnika(1.4);
        modelPojazdu1.setMarka("Skoda");
        modelPojazdu1.setNazwa("Fabia");
        modelPojazdu1.setPrzebieg(12000);
        modelPojazdu1.setNaped("przód");
        modelPojazdu1.setRocznik("1990");

        System.out.println(modelPojazdu1);
//        System.out.println(modelPojazdu1.toString());
//        System.out.println(modelPojazdu2);
//
//        System.out.println("marka pojazdu: " + modelPojazdu2.getMarka());
//        System.out.println(modelPojazdu2.getNaped());
//        System.out.println(modelPojazdu2.getNazwa());

        List<String> strings = new ArrayList<>();
        strings.add("pierwszy"); //element: 0
        strings.add("drugi"); //element: 1
        strings.add("trzy"); //element: 2

//        System.out.println(strings);

//        for (int i = 0; i < strings.size(); i++) {
//        for (int i = 0; i < 4; i++) {
//            System.out.println(strings.get(i));
//        }

//        for (int i = 0; i < 4; i++) {  // wygeneruje ERROR: Index 3 out of bounds for length 3
//        for (int i = 0; i < strings.size(); i++){
//            var tmp = strings.get(i);
//
//            if(tmp == "pierwszy") { // == - sprawdza czy nasza zmienna tmp jest równa wyrażeniu "pierwszy"
//                System.out.println("pierwszy element: " + strings.get(i));
//            } else {
//                System.out.println("inny element: " + strings.get(i));
//            }
//        }

        for (String element : strings){


            if(element == "pierwszy") { // == - sprawdza czy nasza zmienna tmp jest równa wyrażeniu "pierwszy"
                System.out.println("pierwszy element: " + element);
            } else {
                System.out.println("inny element: " + element);
            }
        }



        /*
        Instrukcje warunkowe:
        if - wybór na podstawie warunku typu boolean
        if (contidion) {
        //kod
        }
        if (contidion) {
        //kod
        } else {
        //inny kod
        }
        // nie preferowane
        if (contidion) {
        //kod
        } else if (contidion 2){
        //inny kod
        } else {
        //inny kod   2
        }
        pętle:
        for / forech
        for(int i = 0; i < 10; i++) { <-stosujemy do prostych wyliczeń
        //int i = 0 - wartość startowa pętli
        //i < 10 - warunek do kiedy będzie wykonywany
        // i++ - w jaki sposób będzie zmieniana wartość i.
                //wyjątek
                // i++ - inkrementacja inaczej zapis i = i + 1
                // i-- - dekrementacja inaczej zapis i = i - 1
                // ++i - ?
                // --i - ?
        // kod do wykonania
        }
//reprezentacha foreach
        for(String element : strings){ <- zastosowanie do np List
        //String element - pojedyńczy element z strings
        // : oddzielenie elementów od Obiektu Listy
        // strings - np List<String>, List<BigDecimal> etc.
        //kod do wykonania
        }
         */


        //Kolekcje w Java: Zbiory Danych
        //4 rodzaje kolekcji: List - lista, Set - zbiór, Map - mapa, Queue - kolejka;
        /*
        jeden, dwa, trzy, cztery
        List -> jeden, dwa, trzy, cztery   <- gwarantuje nam kolejność zbioru danych
        Set <- nie gwarantuje kolejności zbioru (za każdym razem może być inna kolejność)
        np:
        a) jeden, dwa, trzy, cztery
        b) trzy, cztery, jeden, dwa
        c) etc.
        Map <- przechowuje wartości jako klucz-wartość
        jeden <-> 1
        dwa <-> 2
        trzy <-> 3
        cztery <-> 4
        Queue <- jeden, dwa, trzy, cztery <- podobne zachowanie do List'y, natomiast możemy zastosować algorytmy LIFO i FIFO
        LIFO - Last In First Out   1, 2, 3, 4, 5, 6, 7, 8, 9, 10, [nowy record]    <<<- kierunek odczytu danych
        FIFO - First In First Out <- opis jak kolejka w sklepie przy kasie
           kierunek odczytu danych --->>>>  1, 2, 3, 4, 5, 6, 7, 8, 9, 10, [nowy record]
        Najpopularniejsze implementacje:
        List:
                ArrayList() - tablica listy, która nie przechowuje informacji o poprzednim i następnym rekordzie
                LinkedList() - tablica listy, która przechowuje informacje o poprzednim i następnym rekordzie
                String nowyString = "";
                List<Model> modele = new ArrayList<>();  w <> przechowujemy konkretny typ danych
                modele.add(modelPojazdu1);
                List<String> lista = new ArrayList<String>();
                lista.add("pierwszy");   <---- add() to metoda dodająca wartości do listy. Jej parametrem jest Object wskazany w <>
                lista.add("drugi");
                System.out.println(lista.get(1)); //wypisze "drugi"
         Set:
                HashSet() -
                TreeSet() -
         */
    }

}