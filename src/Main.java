import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void main(String[] args) {

        ArrayList<Verkaufer> verkauferList = new ArrayList<Verkaufer>();
        ArrayList<Kaufer> kauferList = new ArrayList<Kaufer>();
        this.printMenu(verkauferList, kauferList);
    }
    public void printKauferMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1]\t Suchen\n[2]\t Kaufen");
        switch(scanner.nextInt()){
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Ungültige Eingabe\n");
                break;
        }
    }
    public void printVerkauferMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1]\tProdukt hinzufügen\n[2]\tAusgabe der Produkte\n[3]Produkt löschen\n");
        switch(scanner.nextInt()){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Ungültige Eingabe\n");
                break;
        }
    }
    public void printMenu(ArrayList verkauferList, ArrayList kauferList) {
        System.out.println("Verkäufer [1]\n Käufer [2]\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Wie lautet Ihr name?\n");
                String nameVerkaufer = scanner.nextLine();
                System.out.println("Wie hoch ist ihr Kontostand? \n");
                double balanceVerkaufer = scanner.nextDouble();
                verkauferList.add(new Verkaufer(nameVerkaufer, balanceVerkaufer));
                printVerkauferMenu();
                break;

            case 2:
                System.out.println("Wie lautet Ihr name?\n");
                String nameKaufer = scanner.nextLine();
                System.out.println("Wie hoch ist ihr Kontostand? \n");
                double balanceKaufer = scanner.nextDouble();
                kauferList.add(new Kaufer(nameKaufer, balanceKaufer));
                printKauferMenu();
                break;
            default:
                System.out.println("Falsche Eingabe");
                break;
        }
    }
}