package vezbe2;

public class zad6c {

	public static void main(String[] args) {
		int dani = 0;
		
		for (int i = 2000; i <= 2016; i++) {
			if (i == 2016) {
				for (int j = 1; j <= 3; j++) {
					if (j == 3) {
						for (int k = 1; k <= 10; k++)
							dani++;
					}
					else {
						if (j % 2 == 0) {
							for (int k = 1; k <= 30; k++)
								dani++;
						}
						else {
							for (int k = 1; k <= 31; k++)
								dani++;
						}
					}
				}
			}
			else {
				for (int j = 1; j <= 12; j++) {
					if (j % 2 == 0) {
						for (int k = 1; k <= 30; k++)
							dani++;
					}
					else {
						for (int k = 1; k <= 31; k++)
							dani++;
					}
				}
			}
		}
		
		System.out.println(dani);

	}

}
