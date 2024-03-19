package vezbe2;

public class zad3 {

	public static void main(String[] args) {
		int[] niz = new int [10];
		niz[0] = 1;
		
		for (int i = 0; i < niz.length; i++) {
			niz[i] = 1 + i * 10;
		}
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		

	}

}
