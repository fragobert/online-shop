import java.util.ArrayList;
import java.util.Scanner;
//import the UserManagement class

public class Shop {
    ArrayList<Product> allProducts = new ArrayList<Product>();

    public Shop(){
        UserManagement.admin.addProduct("Apfel", 1.5);
        allProducts.add(new Product("Apfel", 1.5, UserManagement.admin));

    }
    public void startMenu() {
        UserManagement userManagement = new UserManagement();
        Scanner scanner = new Scanner(System.in);
        User user;
        System.out.println("Willkommen bei der Shop-App!");
        System.out.println("1: Registrieren");
        System.out.println("2: Einloggen");
        System.out.println("3: Beenden");
        System.out.println("4: alle user ausgeben");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                userManagement.register();
                startMenu();
                break;
            case 2:
                user = userManagement.login();

                if (user == null) {
                    startMenu();
                }


                mainMenu(user);
                break;
            case 3:
                System.exit(0);
                break;
            case 4:
                userManagement.printUsers();
                startMenu();
                break;
            default:
                System.out.println("Ungültige Eingabe");
                startMenu();
                break;
        }
    }

    public void mainMenu(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Produktverwaltung");
        System.out.println("2: Kontoverwaltung");
        System.out.println("3: Ausloggen und zum Startmenü zurückkehren");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                productMenu(user);
                break;
            case 2:
                accountManagement(user);
                break;
            case 3:
                startMenu();
                break;
            default:
                System.out.println("Ungültige Eingabe");
                mainMenu(user);
                break;
        }
    }

    public void productMenu(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Alle Produkte ausgeben");
        System.out.println("2: Meine Produkte ausgeben");
        System.out.println("3: Produkte suchen");
        System.out.println("4: Produkt hinzufügen");
        System.out.println("5: Produkt löschen");
        System.out.println("6: Produkt kaufen");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                user.printProducts();
                productMenu(user);
                break;
            case 2:
                user.printProducts();
                break;
            case 3:
                System.out.println("Welches Produkt möchten Sie suchen?");
                String serachTerm = scanner.next();
                searchAll(serachTerm);
                productMenu(user);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Welchen Gegenstand möchten Sie kaufen?");
                user.buy();
                break;
        }
    }

    public void accountManagement(User user) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.println("1: Geld aufladen");
        System.out.println("2: Geld abheben");
        System.out.println("3: Kontoauszug");
        System.out.println("4: Zurück zum ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Wie viel möchten sie aufladen?");
                amount = scanner.nextInt();
                user.deposit(amount);
                 System.out.println("Sie haben nun " + user.getBalance() + "€ auf dem Konto");
                 accountManagement(user);
                break;
            case 2:
                System.out.println("Wie viel möchten sie abheben?");
                amount = scanner.nextInt();
                user.withdraw(amount);
                break;
            case 3:
                System.out.println("Ihr Kontostand liegt momentan bei " + user.getBalance() + "€");
                accountManagement(user);
                break;
            case 4:
                mainMenu(user);
                break;
        }
    }

    // gibt alle bereits vorhandenen Produkte aus
    public void addProduct(Product product) {
        allProducts.add(product);
    }
}
