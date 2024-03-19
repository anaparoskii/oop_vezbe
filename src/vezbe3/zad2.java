package vezbe3;

public class zad2 {

	public static void main(String[] args) {
		String a = "4,3,2,1;0,1,0;1,2,3,4";
		
		String[] vrste = a.split(";");
		
		printMatrix(vrste);

	}
	
	static void printMatrix(String[] a) {
		for (int i = 0; i < a.length; i++) {
			String[] column = a[i].split(",");
			
			for (int j = 0; j < column.length; j++) {
				System.out.print(column[j] + " ");
			}
			
			System.out.println();
		}
	}

}
