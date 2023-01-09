import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    /*public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Scanner scanner = new Scanner(System.in);
        Verkaufer seller = new Verkaufer();
        Kaufer customer = new Kaufer();

        // Der Kunde durchsucht die Produkte
        System.out.println("Was möchten Sie kaufen?");
        String searchTerm = scanner.nextLine();
        ArrayList<Product> searchResults = customer.search(searchTerm, products);
        if (searchResults.size() > 0) {
            // Der Kunde wählt ein Produkt aus
            System.out.println("Welches Produkt möchten Sie kaufen?");
            for (int i = 0; i < searchResults.size(); i++) {
                System.out.println((i + 1) + ": " + searchResults.get(i).getName() + " - " + searchResults.get(i).getPrice() + " €");
            }
            int productIndex = scanner.nextInt();
            Product selectedProduct = searchResults.get(productIndex - 1);
            double price = selectedProduct.getPrice();

            // Der Kunde bezahlt
            System.out.println("Wie viel Geld haben Sie?");
            double amount = scanner.nextDouble();
            if (customer.pay(amount)) {
                // Der Verkäufer verschickt das Produkt
                seller.ship(selectedProduct);
                System.out.println("Vielen Dank für Ihren Einkauf!");
            } else {
                System.out.println("Sie haben nicht genug Geld.");
            }
        } else {
            System.out.println("Keine Produkte gefunden.");
        }
    }
*/}
