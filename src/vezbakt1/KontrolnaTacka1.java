package vezbakt1;

import java.util.Scanner;

public class KontrolnaTacka1 {
    static Scanner sc = new Scanner(System.in);
    static int n = 50;
    static String[][] artikli = new String[n][2];
    static int[][] kolicine = new int[n][3];
    static int brojArtikala = 0;

    public static void main(String[] args) {

        System.out.println("*** TRGOVINA ***");

        while (true) {
            System.out.println("""
                [1] Dodaj artikal
                [2] Dodaj količine u magacine
                [3] Prikaži količine u magacinima
                [4] Prikaži prosečne količine u magacinima
                [x] Izlaz
                """);

            String unos = sc.nextLine();

            switch (unos) {
                case "1":
                    dodajArtikal();
                    break;
                case "2":
                    dodajKolicine();
                    break;
                case "3":
                    prikaziKolicine();
                    break;
                case "4":
                    prosecneKolicine();
                    break;
                case "x":
                case "X":
                    System.out.println("*** IZLAZ ***");
                    System.exit(0);
                default:
                    System.out.println("Uneli ste nepostojeću opciju!!!");
            }
        }

    }

    static void dodajArtikal() {
        System.out.println("*** Dodaj artikal ***");
        String[] artikal;

        while (true) {
            System.out.println("\nDodaj novi artikal u formatu [šifra;naziv]:");
            String unos = sc.nextLine();
            try {
                artikal = unos.split(";");
                artikli[brojArtikala][0] = artikal[0];
                artikli[brojArtikala][1] = artikal[1];
                break;
            } catch (Exception e) {
                System.out.println("Unos nije u odgovarajućem obliku!!!");

            }
        }

        System.out.printf("Uspešno dodat artikal %s %s", artikal[0], artikal[1]);
        System.out.println();

        brojArtikala++;
    }

    static void dodajKolicine() {
        System.out.println("*** Dodaj količine artikla u magacinima ***");
        String[] kolicina;

        int index = proveraSifre();

        while (true) {
            System.out.println("Unesite količine u magacinima u formatu " +
                    "[količina1 količina2 količina3]:");
            String unos = sc.nextLine();

            try {
                kolicina = unos.split(" ");
                kolicine[index][0] = Integer.parseInt(kolicina[0]);
                kolicine[index][1] = Integer.parseInt(kolicina[1]);
                kolicine[index][2] = Integer.parseInt(kolicina[2]);
                break;
            } catch (Exception e) {
                System.out.println("Unos nije u odgovarajućem formatu!!!");
            }
        }

        System.out.println("Količine uspešno dodate!!!");
        System.out.println();

    }

    static void prikaziKolicine() {
        System.out.println("*** Prikaz količina ***");
        int index = proveraSifre();

        System.out.printf("\nNaziv: %s", artikli[index][1]);
        System.out.printf("\nŠifra: %s", artikli[index][0]);
        System.out.printf("\nKoličine po magacinima: [%d %d %d]",
                kolicine[index][0], kolicine[index][1], kolicine[index][2]);

        System.out.println();

    }

    static void prosecneKolicine() {
        System.out.println("*** Prikaz prosečnih količina artikala u magacinima ***");

        double suma;

        for (int i = 0; i < brojArtikala; i++) {
            suma = kolicine[i][0] + kolicine[i][1] + kolicine[i][2];

            System.out.printf("\nArtikal: %s %s", artikli[i][0], artikli[i][1]);
            System.out.printf("\nProseča količina: %.2f", suma/3);
            System.out.println();
        }
    }

    static int proveraSifre() {
        int index = -1;

        while (true) {
            System.out.println("\nUnesite šifru artikla:");
            String sifra = sc.nextLine();

            for (int i = 0; i < brojArtikala; i++) {
                if (artikli[i][0].equals(sifra)) {
                    index = i;
                }
            }
            if (index == -1) {
                System.out.println("Niste uneli postojeću šifru!!!");
            } else {
                break;
            }
        }

        return index;
    }

}
