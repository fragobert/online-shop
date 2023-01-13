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
            this.ownedProducts.add(new Product(name, price));
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
    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
}
