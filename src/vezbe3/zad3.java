package vezbe3;

public class zad3 {

	public static void main(String[] args) {
		int[] niz = {1, 8, 17, -2, 4, -15, 3, 9, -1};
		
		System.out.println("Najveći element niza je " 
		+ najveciEl(niz));
		System.out.println("Najmanji element niza je " 
		+ najmanjiEl(niz));
		System.out.println("Srednja vrednost niza je " 
		+ srednjaVrednost(niz));
		double srednjaVrednost = srednjaVrednost(niz);
		int[] niz2 = promeniSve(niz, srednjaVrednost);
		
		System.out.println("Izmenjen niz: ");
		for (int i = 0; i < niz2.length; i++) {
			System.out.print(niz2[i] + " ");
		}

	}
	
	static int najveciEl(int[] niz) {
		int max = niz[0];
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] > max)
				max = niz[i];
		}
		return max;
	}
	
	static int najmanjiEl(int[] niz) {
		int min = niz[0];
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] < min)
				min = niz[i];
		}
		return min;
	}
	
	static double srednjaVrednost(int[] niz) {
		double suma = 0;
		for (int i = 0; i < niz.length - 1; i++) {
			suma += niz[i];
		}
		return suma/niz.length;
	}
	
	static int[] promeniSve(int[] niz, double srednjaVrednost) {
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] < 0)
				niz[i] += srednjaVrednost;
			else
				niz[i] -= srednjaVrednost;
		}
		return niz;
	}

}
