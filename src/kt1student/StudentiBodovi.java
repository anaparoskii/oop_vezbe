package kt1student;

import java.util.Scanner;

public class StudentiBodovi {
    static Scanner sc = new Scanner(System.in);
    static String[][] studenti;
    static String[][] bodovi;

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    [0] Izlaz
                    [1] Dodaj studenta
                    [2] Dodaj bodove studenta
                    [3] Prikaži bodove studenta
                    """);
            String meni = sc.nextLine();

            switch (meni) {
                case "0":
                    System.out.println("*** IZLAZ ***");
                    System.exit(0);
                case "1":
                    dodajStudenta();
                    break;
                case "2":
                    dodajBodove();
                    break;
                case "3":
                    prikaziBodove();
                    break;
                default:
                    System.out.println("Neispravan unos!!! Pokušajte ponovo!");
            }
        }
    }

    static void dodajStudenta() {

    }

    static void dodajBodove() {

    }

    static void prikaziBodove() {

    }
}
