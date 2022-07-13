package pl.cyber.trainees;

public class Calculator {
    public static void main(String[] args) {
        wydrukujWszystkieOperacje(5,6);
        wydrukujWszystkieOperacje(3,8);
        wydrukujWszystkieOperacje(2,3);
        wydrukujWszystkieOperacje(4,2);
    }

    public static Integer dodaj(Integer a, Integer b) {
        return a + b;
    }

    public static int odejmij(int a, int b) {
        return a - b;
    }

    public static int pomnoz(int a, int b) {
        return a * b;
    }
    public static double podziel(int a,int b){
        return (double) a / b;
    }
    public static void wydrukujWszystkieOperacje(int a, int b) {
        System.out.println(a + " + " + b + " = " + dodaj(a, b));
        System.out.println(a + " - " + b + " = " + odejmij(a, b));
        System.out.println(a + " * " + b + " = " + pomnoz(a, b));
        System.out.println(a + " / " + b + " = " + podziel(a, b));
    }
}
// komentarz