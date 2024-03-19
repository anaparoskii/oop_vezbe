package vezbe2;

public class zad4 {

	public static void main(String[] args) {
		int[][] nizB = new int[4][7];
		
		for (int i = 0; i < nizB.length; i++)
			for (int j = 0; j < nizB[i].length; j++)
				nizB[i][j] = j;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.println(nizB[i][j]);
			}
		}
		
	}

}
