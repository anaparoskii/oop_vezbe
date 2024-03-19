package vezbe2;

public class zad12 {

	public static void main(String[] args) {
		int[][] matrica = new int[7][5];
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = (i + 1) * (i + 1);
			}
		}
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
