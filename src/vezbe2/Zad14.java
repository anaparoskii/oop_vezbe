package vezbe2;

public class Zad14 {

	public static void main(String[] args) {
		int[] X = {1, 4, 5, 9};
		int[] Y = {1, 4, 5, 9};
		int[] tacke = new int[4];
		
		int D = ((X[0] - X[1]) * (X[0] - X[1])) 
				+ ((Y[0] - Y[1]) * (Y[0] - Y[1]));
		
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X.length; j++) {
				int d = ((X[i] - X[j]) * (X[i] - X[j])) 
						+ ((Y[i] - Y[j]) * (Y[i] - Y[j]));
				if ((d < D)&&(d != 0)) {
					D = d;
					tacke[0] = X[i];
					tacke[1] = Y[i];
					tacke[2] = X[j];
					tacke[3] = Y[j];
				}
			}
		}
		
		System.out.println("Prva tačka: (" + tacke[0] + ", " + tacke[1] + ")");
		System.out.println("Druga tačka: (" + tacke[2] + ", " + tacke[3] + ")");
				
	}

}
