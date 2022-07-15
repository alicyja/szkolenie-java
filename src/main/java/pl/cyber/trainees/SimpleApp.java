package pl.cyber.trainees;

import dziedziczenie.Kolor;
import dziedziczenie.Model;

public class SimpleApp {
    public static void main(String[] args) {
        System.out.println("My first Application");


        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VM", "2020", "przód", "Passat", 10000, 2.0, Kolor.ZIELONY);

        var modelPojazdu3 = new Model("VM", "2000", "przód", "passat", 300000, 2.0, Kolor.valueOf("NIEBIESKI"));

        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setNazwa("Audi");
        modelPojazdu1.setPrzebieg("20000");
        modelPojazdu1.setNaped("Przód");



        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu1);
        System.out.println(modelPojazdu2.getMarka());
        System.out.println(modelPojazdu2.getNaped());
        System.out.println(modelPojazdu2.getNazwa());
    }
}
