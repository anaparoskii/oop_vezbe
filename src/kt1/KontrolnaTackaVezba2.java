package kt1;

import java.util.Scanner;

public class KontrolnaTackaVezba2 {

    static Scanner sc = new Scanner(System.in);
    static int n = 50;
    static String[][] artikli = new String[n][2];
    static String[][] kolicine = new String[n][3];
    static int brojArtikala = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    [0] Izlaz
                    [1] Dodaj artikal
                    [2] Dodaj količine
                    [3] Prikaži količine
                    """);
            System.out.println("Unesite stavku menija:");
            String meni = sc.nextLine();

            switch (meni) {
                case "0":
                    System.exit(0);
                case "1":
                    dodajArtikal();
                    break;
                case "2":
                    dodajKolicine();
                    break;
                case "3":
                    prikaziKolicine();
                    break;
                default:
                    System.out.println("Niste uneli postojeću stavku!!!");
            }
        }
    }

    static void dodajArtikal() {
        System.out.println("Artikal u formatu [šifra;naziv]:");
        String unos = sc.nextLine();
        String[] artikalNiz = unos.split(";");

        artikli[brojArtikala][0] = artikalNiz[0];
        artikli[brojArtikala][1] = artikalNiz[1];

        brojArtikala++;

        System.out.printf("Uspešno unet artikal %s %s",
                artikalNiz[0], artikalNiz[1]);
        System.out.println();
    }

    static void dodajKolicine() {
        int indeks = -1;
        System.out.println("Unesite šifru artikla:");
        String sifra = sc.nextLine();
        for (int i = 0; i < brojArtikala; i++) {
            if (artikli[i][0].equals(sifra)) {
                indeks = i;
            }
        }
        System.out.println("Količine u formatu [k1 k2 k3]:");
        String unos = sc.nextLine();
        String[] kolicinaNiz = unos.split(" ");

        kolicine[indeks][0] = kolicinaNiz[0];
        kolicine[indeks][1] = kolicinaNiz[1];
        kolicine[indeks][2] = kolicinaNiz[2];

        System.out.println();
    }

    static void prikaziKolicine() {
        int indeks = -1;
        System.out.println("Unesite šifru artikla:");
        String sifra = sc.nextLine();
        for (int i = 0; i < brojArtikala; i++) {
            if (artikli[i][0].equals(sifra)) {
                indeks = i;
            }
        }

        System.out.printf("Artikal: %s %s", artikli[indeks][0], artikli[indeks][1]);
        System.out.printf("\nKoličine: %s, %s, %s",
                kolicine[indeks][0], kolicine[indeks][1], kolicine[indeks][2]);
        System.out.println();
    }
}
