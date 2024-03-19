package vezbe3;

public class zad5 {
    public static void main(String[] args) {

        String items = "Coko Plazma|s01|Bambi|85.30|akcija-" +
                "Smoki|s02|Stark|55.00|nije na akciji-" +
                "Cipsi|s03|Marbo|115.20|nije na akciji-" +
                "Krem Bananica|s04|Stark|11.00|akcija-";

        String[] allValues = items.split("-");

        System.out.println("Imena svih artikala: ");
        printNames(allValues);
        System.out.println("\n\nStavke za odabran artikal: ");
        printArticle(allValues);
        System.out.println("\nArtikli na akciji: ");
        printSale(allValues);
        System.out.println("\nAtrikli od odabranog proizvodjaca: ");
        printProducer(allValues);
    }

    static void printNames(String[] items) {
        for (String item : items) {
            String[] itemValues = item.split("\\|");

            for (int j = 0; j < 1; j++) {
                System.out.print(itemValues[j] + "|");
            }
        }
    }

    static void printArticle(String[] items) {
        int n = 2;
        for (int i = n; i < n + 1; i++) {
            String[] itemValues = items[i].split("\\|");

            for (String itemValue : itemValues) {
                System.out.print(itemValue + "|");
            }
            System.out.println();
        }
    }

    static void printSale(String[] items) {
        for (String item : items) {
            boolean print = false;
            String[] itemValues = item.split("\\|");

            for (String itemValue : itemValues) {
                if (itemValues[4].equals("akcija")) {
                    System.out.print(itemValue + "|");
                    print = true;
                }
            }
            if (print)
                System.out.println();
        }
    }

    static void printProducer(String[] items) {
        String producer = "Stark";
        for (String item : items) {
            boolean print = false;
            String[] itemValues = item.split("\\|");

            for (String itemValue : itemValues) {
                if (itemValues[2].equals(producer)) {
                    System.out.print(itemValue + "|");
                    print = true;
                }
            }
            if (print)
                System.out.println();
        }
    }
}
