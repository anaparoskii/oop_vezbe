package vezbe2;

public class zad8 {

	public static void main(String[] args) {
		int[][] matrica = new int[5][7];
		
		for (int i = 0; i < matrica.length; i++)
			for (int j = 0; j < matrica[i].length; j++)
				matrica[i][j] = j + i;
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

	}

}
