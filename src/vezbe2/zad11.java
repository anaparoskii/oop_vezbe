package vezbe2;

public class zad11 {

	public static void main(String[] args) {
		int n = 4;
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		
		for (int i = 0; i < n; i++) {
			A[i] = i;
		}
		
		for (int i = 0; i < n; i++) {
			B[i] = i + 2;
		}
		
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) 
				C[i] = A[i] * B[(n - 1) - i];
			else
				C[i] = A[i] + B[(n - 1) - i];
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(C[i] + " ");
		}

	}

}
