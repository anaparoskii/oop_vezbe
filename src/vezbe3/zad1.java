package vezbe3;

public class zad1 {

	public static void main(String[] args) {
		String a = "Norvežanin Kjetil Jansrud osvojio je zlatnu medalju u superveleslalomu na Zimskim "
				+ "olimpijskim igrama u Sočiju pošto je za 30 stotih delova sekunde bio brži od "
				+ "drugoplasiranog Amerikanca Endrjua Vajbrehta.";
		
		obrniSlova(a);
		System.out.println();
		obrniReci(a);

	}
	
	static void obrniSlova(String a) {
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}
	
	static void obrniReci(String a) {
		String[] reci = a.split(" ");
		for (int i = reci.length - 1; i >= 0; i--) {
			System.out.println(reci[i]);
		}
	}

}
