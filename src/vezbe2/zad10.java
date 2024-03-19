package vezbe2;

public class zad10 {

	public static void main(String[] args) {
		int[][] A = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int temp;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if (i == j) {
					if (A[i][j] != A[i][A[i].length - (i + 1)]) {
						int a = A[i][j];
						int b = A[i][A[i].length - (i + 1)];
						temp = a;
						a = b;
						b = temp;
						A[i][j] = a;
						A[i][A[i].length - (i + 1)] = b;
					}
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}

}
