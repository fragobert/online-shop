import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

class Verkaufer {
    private String name;
    private ArrayList<Product> products;
    private double balance;

    public Verkaufer(String name, double balance) {
        this.products = new ArrayList<Product>();
        this.balance = balance;
        this.name = name;
    }

    public void addProduct(String name, double price, int quantity) {
        for(int i = 0; i < quantity; i++) {
            this.products.add(new Product(name, price));
        }
    }
    public void printProducts() {
        for (Product product : this.products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " €"+ "ID: " + product.getID());
        }
    }
    public void deleteProduct(){

    }
    /*public void ship(Product selectedProduct) {
        //TODO optional
    }*/
}