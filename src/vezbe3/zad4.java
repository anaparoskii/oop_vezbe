package vezbe3;

public class zad4 {

	public static void main(String[] args) {
		int[] A = {4, 7, 3, 2, 5};
		int[] B = {6, 8, 1, 9, 3};
		
		int[] C = odrediNiz(A, B);
		
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}

	}
	
	static int[] odrediNiz(int[] a, int[] b) {
		int[] povratniNiz = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			povratniNiz[i] = a[i] + b[i];
		}
		return povratniNiz;
	}

}
