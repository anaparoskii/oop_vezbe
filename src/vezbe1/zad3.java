package vezbe1;

public class zad3 {

	public static void main(String[] args) {
		double year;
		year = (double) 2001;
		
		proveraGodine.provera(year);

	}

}

class proveraGodine {
	static void provera(double godina) {
		if ((1538 <= godina)&&(godina <= 10000))
			proveraPrestupne.prestupna(godina);
		else
			System.out.println("Godina nije odgovarajuća!!!");
		
	}
}

class proveraPrestupne {
	static void prestupna(double godina) {
		if ((godina % 400 == 0)||((godina % 100 != 0)&&(godina % 4 == 0)))
			System.out.println("Godina JESTE prestupna!");
		else 
			System.out.println("Godina NIJE prestupna!");
		
	}
}
