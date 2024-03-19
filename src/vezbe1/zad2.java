package vezbe1;

public class zad2 {

	public static void main(String[] args) {
		
		int povrsinaKvadrata = 16;
		int osnovicaTrougla = 4;
		int krakTrougla = 6;
		
		double stranicaKvadrata = izracunajStranicu(povrsinaKvadrata);
		double povrsinaTrougla = izracunajPovrsinu(osnovicaTrougla, krakTrougla);
		
		System.out.println(stranicaKvadrata);
		System.out.println(povrsinaTrougla);

	}
	
	static double izracunajStranicu(int povrsina) {
		 return Math.sqrt(povrsina);
	}
	
	static double izracunajPovrsinu(int osnovica, int krak) {
		double h; 
		h = Math.sqrt(krak * krak - (osnovica * osnovica) / 4);
		return (osnovica * h) / 2;
	}

}

