package vezbe2;

public class zad9 {

	public static void main(String[] args) {
		int suma = 0;
		int[][] matrica = new int[5][7];
		
		for (int i = 0; i < matrica.length; i++)
			for (int j = 0; j < matrica[i].length; j++)
				matrica[i][j] = j + i;
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (i == j)
					suma += matrica[i][j];
			}
		}
		
		System.out.println("Suma elemenata na glavnoj dijagonali je: " + suma);
				

	}

}
