package vezbe1;

public class zad8 {

	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 5;
		c = 6;
		
		diskusija.diskusijaParametara(a, b, c);
	}

}

class diskusija {
	static void diskusijaParametara(int a, int b, int c) {
		if ((a == 0)&&(b != 0)) {
			System.out.println("Postoji jedno realno rešenje: ");
			System.out.println(- (c / b));
		}
		else if (((b * b) - 4 * a * c) > 0) {
			System.out.println("Postoje najviše dva realna rešenja: ");
			System.out.println((-b + ((b * b) - 4 * a * c)) / 2 * a);
			System.out.println((-b - ((b * b) - 4 * a * c)) / 2 * a);
		}
		else {
			System.out.println("Nema realnih rešenja");
		}
	}
}
