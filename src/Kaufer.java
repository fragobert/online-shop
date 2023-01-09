import java.util.ArrayList;

public class Kaufer {
    private ArrayList<Product> ownedProducts;
    private double balance;
    private String name;

    public Kaufer(String name, double balance) {
        this.ownedProducts = new ArrayList<Product>();
        this.balance = balance;
        this.name = name;
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

}