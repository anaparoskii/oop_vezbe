package vezbe3;

import java.util.Scanner;

public class zad6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*** Potapanje brodića ***");
		
		int brojVrsti = koordinataTerena("Unesite broj vrsti terena:");
		int brojKolona = koordinataTerena("Unesite broj kolona terena:");
		
		String[][] mojTeren = new String[brojVrsti][brojKolona];
		postaviVrednosti(mojTeren);
		String[][] protivnickiTeren = new String[brojVrsti][brojKolona];
		postaviVrednosti(protivnickiTeren);
		
		postavkaBrodica(mojTeren);
		
		while (true) {
			System.out.println("[0] Gađaj protivnika\n[x] Izađi iz alpikacije");
			String unos = sc.next();
			if (unos.equals("0")) {
				gadjajProtivnika(protivnickiTeren);
				prikaziTeren("Teren sa brodićima:", mojTeren);
			}
			else if (unos.equals("x")) {
				System.out.println("*** Izlaz iz aplikacije ***");
				sc.close();
				System.exit(0);
			}
			else {
				System.out.println("Unos nije odgovarajuć!!!");
			}
		}
		
	}
	
	static int koordinataTerena(String poruka) {
		while (true) {
			System.out.println(poruka);
			String n = sc.next();
			if (jeBroj(n)) {
				return Integer.parseInt(n);
			}
		}
	}
	
	static boolean jeBroj(String prompt) {
		try {
			Integer.parseInt(prompt);
			return true;
		}
		catch (Exception e) {
			System.out.println("Niste uneli broj!!!");
			return false;
		}
	}
	
	static void postaviVrednosti(String[][] teren) {
		for (int i = 0; i < teren.length; i++) {
			for (int j = 0; j < teren[i].length; j++) {
				teren[i][j] = "0";
			}
		}
	}
	
	static void postavkaBrodica(String[][] teren) {
		for (int i = 4; i > 0; i--) {    // i = boat size
			sc.nextLine();
			System.out.println("Brodic - veličina: " + i);
			String polozaj = polozajBrodica();
			System.out.println("Za horizontalno postavljene brodove, grade se na dole od zadate koordinate.\n"
					+ "Za vertikalno postavljene brodove, grade se na desno od zadate koordinate.");
			int vrsta = koordinataTerena("Unesite vrstu gde postavljate brodić:");
			int kolona = koordinataTerena("Unesite kolonu gde postavljate brodić:");
			staviBrodic(teren, i, vrsta-1, kolona-1, polozaj);
			prikaziTeren("Teren sa brodićima:", teren);
		}
	}
	
	static String polozajBrodica() {
		while (true) {
			System.out.println("Postavi brod: \n"
					+ "[1] Horizontalno\n[2] Vertikalno");
			String izbor = sc.nextLine();
			if (izbor.equals("1")) {
				return "h";
			}
			else if (izbor.equals("2")) {
				return "v";
			}
			else {
				System.out.println("Niste uneli odgovarajuću stavku!!!");
			}
		}
	}
	
	static void staviBrodic(String[][] teren, int i, int vrsta, int kolona, String polozaj) {
		for (int j = 0; j < i; j++) {
			if (polozaj == "v") {
				teren[vrsta + j][kolona] = "1";
			}
			else if (polozaj == "h") {
				teren[vrsta][kolona + j] = "1";
			}
		}
	}
	
	static void prikaziTeren(String poruka, String[][] teren) {
		System.out.println(poruka);
		for (int i = 0; i < teren.length; i++) {
			for (int j = 0; j < teren[i].length; j++) {
				System.out.print(teren[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void gadjajProtivnika(String[][] teren) {
		int gadjajVrstu;
		int gadjajKolonu;
		System.out.println("Unesite koordinate vrste, pa kolone, protivnickog terena.");
		while (true) {
			gadjajVrstu = koordinataTerena("Unesite vrstu:");
			gadjajKolonu = koordinataTerena("Unesite kolonu:");
			if (jeSlobodno(teren, gadjajVrstu, gadjajKolonu)) {
				break;
			}
		}
		while (true) {
			System.out.println("Unesite: \n"
					+ "[1] Ako ste pogodili\n[x] Ako ste promašili");
			String rezultat = sc.next();
			if (rezultat.equals("1")) {
				teren[gadjajVrstu][gadjajKolonu] = rezultat;
				break;
			}
			else if (rezultat.equals("x")) {
				teren[gadjajVrstu][gadjajKolonu] = rezultat;
				break;
			}
			else {
				System.out.println("Niste uneli odgovarajuću stavku!!!");
		
			}
		}
		prikaziTeren("Teren sa pokušajima:", teren);
	}
	
	static boolean jeSlobodno(String[][] teren, int vrsta, int kolona) {
		if (teren[vrsta][kolona] == "0") {
			return true;
		}
		else {
			System.out.println("Već ste gadjali to polje!!!");
			return false;
		}
	}

}
