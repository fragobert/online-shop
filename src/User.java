import java.util.ArrayList;

public class User {
    private String username, name, password;
    private ArrayList<Product> ownedProducts;
    private double balance;

    public User(String username,String name, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        ownedProducts = new ArrayList<Product>();
        balance = 0;
    }

    public void addProduct(String name, double price, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Product newProduct = new Product(name, price);
            this.ownedProducts.add(newProduct);

        }
    }

    public void printProducts() {
        for (Product product : this.ownedProducts) {
            System.out.println(product.getName() + " - " + product.getPrice() + " €" + "ID: " + product.getID());
        }
    }

    public void deleteProduct() {

    }

    public ArrayList<Product> search(String searchTerm, ArrayList<Product> products) {
        ArrayList<Product> searchResults = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getName().contains(searchTerm)) {
                searchResults.add(product);
            }
        }
        return searchResults;
    }

    public boolean buy(Product product) {
        if (this.balance >= product.getPrice()) {
            this.balance -= product.getPrice();
            this.ownedProducts.add(product);
            return true;
        } else {
            return false;
        }
    }

    public void withdraw(double amount) {
        if(balance < 0 || balance < amount){
            System.out.println("Abheben felgeschlagen!");
        }else{
            System.out.println(amount + "€ wurden von Ihrem Konto abgehoben!");
            this.balance -= amount;
        }
    }
    public void deposit(double amount) {
        if(amount < 0){
            System.out.println("Geldbetrag muss positiv sein!");
            this.balance += amount;
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
}
