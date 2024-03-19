package v3z6;

import java.util.Scanner;

public class Vezbe3Zadatak6 {
	
	static Scanner sc = new Scanner(System.in);
	static String tekst;
	
	static String[][] proizvodi;

	public static void main(String[] args) {
		
		ucitajPodatke();
		
		System.out.println("*** PRODAVNICA ***");

		while (true)  {
			System.out.println("""
                    [1] Ispiši nazive artikala
                    [2] Ispiši podatke odabranog artikla
                    [3] Ispiši artikle na akciji
                    [4] Ispiši artikle odabranog proizvođača
                    [x] Izlaz""");
			
			String meni = sc.nextLine();
			
			if (meni.equals("1")) {
				ispisiNazive();
			}
			else if (meni.equals("2")) {
				ispisiArtikal();
			}
			else if (meni.equals("3")) {
				ispisiAkcije();
			}
			else if (meni.equals("4")) {
				ispisProizvodjaca();
			}
			else if (meni.equalsIgnoreCase("x")) {
				System.out.println("*** IZLAZ ***");
				sc.close();
				break;
			}
		}

	}
	
	static void ucitajPodatke() {
		tekst = """
                Coko Plazma|s01|Bambi|85.30|akcija
                Smoki|s02|Stark|55.00|nije na akciji
                Cipsi|s03|Marbo|115.20|nije na akciji
                Krem Bananica|s04|Stark|11.00|akcija
                """;
		
		String[] proizvodiNiz = tekst.split("\n");
		
		proizvodi = new String[proizvodiNiz.length][];
		
		for (int i = 0; i < proizvodiNiz.length; i++) {
			String[] proizvod = proizvodiNiz[i].split("\\|");
			proizvodi[i] = new String[proizvod.length];
			for (int j = 0; j < proizvod.length; j++) {
				proizvodi[i][j] = proizvod[j];
			}
		}
	}
	
	static void ispisiNazive() {
		System.out.println("*** Nazivi artikala: ");
        for (String[] strings : proizvodi) {
            System.out.println(strings[0]);
        }
		System.out.println();
	}
	
	static void ispisiArtikal() {
		System.out.println("*** Ispis osobina određenog artikla");
		ispisiNazive();
		System.out.println("Unesite naziv:");
		String unos = sc.nextLine();

        for (String[] strings : proizvodi) {
            if (strings[0].equalsIgnoreCase(unos)) {
                System.out.printf("Naziv: %s \n", strings[0]);
                System.out.printf("Šifra: %s \n", strings[1]);
                System.out.printf("Proizvođač: %s \n", strings[2]);
                System.out.printf("Cena: %s \n", strings[3]);
                if (strings[4].equalsIgnoreCase("akcija")) {
                    System.out.println("Akcija: da");
                } else {
                    System.out.println("Akcija: ne");
                }
            }
        }
		System.out.println();
	}
	
	static void ispisiAkcije() {
		System.out.println("*** Ispis artikala na akciji");

        for (String[] strings : proizvodi) {
            if (strings[4].equalsIgnoreCase("akcija")) {
                System.out.printf("Naziv: %s \n", strings[0]);
                System.out.printf("Šifra: %s \n", strings[1]);
                System.out.printf("Proizvođač: %s \n", strings[2]);
                System.out.printf("Cena: %s \n\n", strings[3]);
            }
        }
	}
	
	static void ispisProizvodjaca() {
		System.out.println("*** Ispis osobina artikla određenog proizvođača");
        for (String[] strings : proizvodi) {
            System.out.println(strings[2]);
        }
		System.out.println();
		System.out.println("Unesite naziv proizvođača:");
		String unos = sc.nextLine();

        for (String[] strings : proizvodi) {
            if (strings[2].equalsIgnoreCase(unos)) {
                System.out.printf("Naziv: %s \n", strings[0]);
                System.out.printf("Šifra: %s \n", strings[1]);
                System.out.printf("Cena: %s \n", strings[3]);
                if (strings[4].equalsIgnoreCase("akcija")) {
                    System.out.println("Akcija: da");
                } else {
                    System.out.println("Akcija: ne\n");
                }
            }
        }
		System.out.println();
	}

}
