package kt1;

import java.util.Scanner;

public class KontrolnaTackaVezba1 {
	static Scanner sc = new Scanner(System.in);
	static int n = 50;
	static String[][] artikli = new String[n][2];
	static String[][] kolicine = new String[n][3];
	static int brojArtikala = 0;

	public static void main(String[] args) {
		System.out.println(">>> TRGOVINA ANČICA <<<");
		
		while (true) {
			
			System.out.println("""
                    [1] Dodaj artikal
                    [2] Dodaj količine u magacin
                    [3] Prikaži količine u magacinu
                    [4] Prikaži prosečnu količinu artikala
                    [x] Izazak iz aplikacije""");
			
			String unos = sc.nextLine();
			
			if (unos.equals("1")) {
				dodajArtikal(artikli);
			}
			else if (unos.equals("2")) {
				dodajKolicine(kolicine);
			}
			else if (unos.equals("3")) {
				prikaziKolicine();
			}
			else if (unos.equals("4")) {
				prosecneKolicine();
			}
			else if (unos.equalsIgnoreCase("x")) {
				System.out.println(">>> IZLAZAK IZ APLIKACIJE <<<");
				sc.close();
				System.exit(0);
			}
			else {
				System.out.println("Unos nije odgovarajuć!!!");
			}
			
		}
		
	}
	
	static void dodajArtikal(String[][] artikli) {
		System.out.println("*** Dodavanje artikla ***");
		System.out.println("Unesite podatke o artiklu u formatu [šifra;naziv]:");
		String unos = sc.nextLine();
		String[] artikal = unos.split(";");
		artikli[brojArtikala][0] = artikal[0];
		artikli[brojArtikala][1] = artikal[1];
		System.out.printf("Uspešno dodat artikal %s %s", artikal[0], artikal[1]);
		brojArtikala++;
		System.out.println();
	}
	
	static void dodajKolicine(String[][] kolicine) {
		int index = -1;
		System.out.println("*** Dodavanje količina u magacin ***");
		while (true) {
			System.out.println("Unesite šifru artikla:");
			String sifra = sc.nextLine();
			for (int i = 0; i < brojArtikala; i++) {
				if (artikli[i][0].equals(sifra)) {
					index = i;
				}
			}
			if (index == -1) {
				System.out.println("Ne postoji artikal sa tom šifrom!!!");
			}
			else {
				break;
			}
		}
		System.out.println("Unesite količine u formatu [količina1 količina2 količina3]:");
		String unos = sc.nextLine();
		String[] kolicina = unos.split(" ");
		
		kolicine[index][0] = kolicina[0];
		kolicine[index][1] = kolicina[1];
		kolicine[index][2] = kolicina[2];
	}
	
	static void prikaziKolicine() {
		int index = -1;
		String sifra;
		System.out.println("*** Prikaz količina u magicinima ***");
		while (true) {
			System.out.println("Unesite šifru artikla:");
			sifra = sc.nextLine();
			for (int i = 0; i < brojArtikala; i++) {
				if (artikli[i][0].equals(sifra)) {
					index = i;
				}
			}
			if (index == -1) {
				System.out.println("Ne postoji artikal sa tom šifrom!!!");
			}
			else {
				break;
			}
		}
		String kolicina1 = kolicine[index][0];
		String kolicina2 = kolicine[index][1];
		String kolicina3 = kolicine[index][2];
		String ime = artikli[index][1];
		
		System.out.printf("Artikal %s - %s: [%s %s %s]", sifra, ime, kolicina1, kolicina2, kolicina3);
		System.out.println();
	}
	
	static void prosecneKolicine() {
		int suma;
		System.out.println("*** Prosečna količina artikala ***");
		for (int i = 0; i < brojArtikala; i++) {
			int kolicina1 = Integer.parseInt(kolicine[i][0]);
			int kolicina2 = Integer.parseInt(kolicine[i][1]);
			int kolicina3 = Integer.parseInt(kolicine[i][2]);
			suma = kolicina1 + kolicina2 + kolicina3;
			String sifra = artikli[i][0];
			String ime = artikli[i][1];
			
			System.out.printf("Artikal %s %s: %.2f", sifra, ime, (double)suma/3);
			System.out.println();
		}
	}

}
