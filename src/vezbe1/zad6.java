package vezbe1;

public class zad6 {

	public static void main(String[] args) {
		int R = 6;
		int h = 4;
		int r = R / 2;
		
		povrsina.izracunaj(r, h);

	}

}

class povrsina {
	static void izracunaj(int poluprecnik, int visina) {
		double s;
		s = Math.sqrt((poluprecnik * poluprecnik) + (visina * visina));
		System.out.println(poluprecnik * Math.PI * (s + poluprecnik));
	}
}
