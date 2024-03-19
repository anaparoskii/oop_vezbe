package vezbe1;

public class zad5 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		racun.izracunajPovrsinu(a, b, c);
		racun.izracunajZapreminu(a, b, c);
	}

}

class racun {
	static void izracunajPovrsinu(int x, int y, int z) {
		System.out.println(2 * (x * y + y * z + z * x));
	}
	
	static void izracunajZapreminu(int x, int y, int z) {
		System.out.println(x * y * z);
	}
}
