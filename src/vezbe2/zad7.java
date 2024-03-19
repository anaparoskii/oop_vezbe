package vezbe2;

public class zad7 {

	public static void main(String[] args) {
		int[] A = {-10, 3, 16, 1, 4, -2};
		int min = A[0];
		int max = A[0];
		int suma = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] < min)
				min = A[i];
			if (A[i] > max)
				max = A[i];
		}
		
		System.out.print("Najmanji element niza je: " + min);
		System.out.print("\nNajveći element niza je: " + max);
		
		for (int i = 0; i < A.length; i++) {
			suma += A[i];
		}
		
		System.out.print("\nSrednja vrednost niza je: " + (suma/A.length));
		
		for (int i = 0; i < A.length; i++) {
			if ((A[i] > 0)&&(A[i] < (suma/A.length)))
				System.out.print("\nPozitivni brojevi manji od srednje vrednosti: "
								+ A[i]);
		}
	
	}

}
