package vezbe2;

public class Zad15 {

	public static void main(String[] args) {
		int n = 5;
		
		// i -> rows, while it's lesser then, we add 2 because every row has 2 more *
		// j becomes less when i becomes more, because every row has one less -
        for (int i = 1; i < 2 * n + 1; i += 2) {
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	
        	for (int j = 0; j < i; j++) {
        		System.out.print("*");
        	}
        	
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	System.out.println();
        }
        
        // same, but we make i lesser, and j bigger
        for (int i = 2 * n + 1; i > 0; i -= 2) {
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	
        	for (int j = 0; j < i; j++) {
        		System.out.print("*");
        	}
        	
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	System.out.println();
        }
        
        System.out.println();
        
        
        // inverted shape
        for (int i = 2 * n + 1; i > 0; i -= 2) {
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	
        	for (int j = 0; j < i; j++) {
        		System.out.print("*");
        	}
        	
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	System.out.println();
        }
        
        for (int i = 3; i <= 2 * n + 1; i += 2) {
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	
        	for (int j = 0; j < i; j++) {
        		System.out.print("*");
        	}
        	
        	for (int j = 0; j < n - (i - 1)/2; j++) {
        		System.out.print(" ");
        	}
        	System.out.println();
        }

	}

}
