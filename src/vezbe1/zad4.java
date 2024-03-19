package vezbe1;

public class zad4 {

	public static void main(String[] args) {
		int centimetri;
		centimetri = (int) 324;
		
		metri.kolikoMetara(centimetri);
		decimetri.kolikoDeci(centimetri);

	}

}

class metri {
	static void kolikoMetara(int centimetri) {
		System.out.println(centimetri / 100);
	}
}

class decimetri {
	static void kolikoDeci(int centrimetri) {
		System.out.println(centrimetri / 10);
	}
}
