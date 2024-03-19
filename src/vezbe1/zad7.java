package vezbe1;

public class zad7 {

	public static void main(String[] args) {
		double x;
		double y;
		x = 1;
		y = 7;
		
		System.out.println(odrediIzlaz.odrediZ(x, y));

	}

}

class odrediIzlaz {
	static double odrediZ(double x, double y) {
		if (x < y)
			return ((Math.max(x, y)) / (1 + Math.abs(Math.min(x, y))));
		else
			return ((Math.max(x, y)) / (1 + Math.min(x, y)));
	}
}
