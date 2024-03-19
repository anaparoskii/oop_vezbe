package vezbe2;

public class Zad13 {

	public static void main(String[] args) {
		int rezultat = 1;
		int[][] matrica = new int[7][5];
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = (i + 1) * (i + 1);
			}
		}
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (i < j) {
					rezultat *= matrica[i][j];
				}
			}
		}
		
		System.out.println("Proizvod elemenata iznad dijagonale je: " + rezultat);

	}

}
