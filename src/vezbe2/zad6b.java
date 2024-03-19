package vezbe2;

public class zad6b {

	public static void main(String[] args) {
		int dani = 0;
		
		for (int i = 2000; i < 2016; i++)
			for (int j = 1; j <= 12; j++) {
				if (j % 2 == 0)
					for (int k = 1; k <= 30; k++)
						dani++;
				else
					for (int k = 1; k <= 31; k++)
						dani++;
			}
		
		System.out.println(dani);

	}

}
