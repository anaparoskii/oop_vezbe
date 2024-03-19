package kt1student;

import java.util.Scanner;

public class StudentiBodovi {
    static Scanner sc = new Scanner(System.in);
    static int n = 80;
    static String[][] studenti = new String[n][3];
    static String[][] bodovi = new String[n][3];
    static int brojStudenata = 0;

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
        System.out.println("*** Dodaj novog studenta");
        System.out.println("Unesite indeks, ime i prezime studenta u formatu " +
                "[indeks;ime;prezime]:");
        String unos = sc.nextLine();
        String[] student = unos.split(";");

        studenti[brojStudenata][0] = student[0];
        studenti[brojStudenata][1] = student[1];
        studenti[brojStudenata][2] = student[2];

        System.out.printf("Uspešno dodat student %s: %s %s",
                student[0], student[1], student[2]);
        System.out.println();

        brojStudenata++;
    }

    static void dodajBodove() {
        System.out.println("*** Dodaj bodove studenta");
        int index = nadjiStudenta();
        System.out.println("Unesite bodove studenta u formatu " +
                "[bodovi1 bodovi2 bodovi3]:");

        String unos = sc.nextLine();

        String[] bod = unos.split(" ");

        bodovi[index][0] = bod[0];
        bodovi[index][1] = bod[1];
        bodovi[index][2] = bod[2];

        System.out.println();
    }

    static void prikaziBodove() {
        System.out.println("*** Prikaži bodove studenta");
        int index = nadjiStudenta();
        System.out.printf("\nIndeks: %s", studenti[index][0]);
        System.out.printf("\nIme: %s", studenti[index][1]);
        System.out.printf("\nPrezime: %s", studenti[index][2]);
        System.out.printf("""
                        \nBodovi:
                        ispit 1 - %s
                        ispit 2 - %s
                        ispit 3 - %s""",
                bodovi[index][0], bodovi[index][1], bodovi[index][2]);

        System.out.println();
    }

    static int nadjiStudenta() {
        int index = -1;
        while (true) {
            System.out.println("Unesite indeks studenta:");
            String indeksStudenta = sc.nextLine();
            for (int i = 0; i < brojStudenata; i++) {
                if (studenti[i][0].equals(indeksStudenta)) {
                    index = i;
                }
            }
            if (index == -1) {
                System.out.println("Ne postoji student sa tim brojem indeksa!!!");
            } else {
                break;
            }
        }
        return index;
    }
}
