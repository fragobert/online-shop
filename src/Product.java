public class Product {
    private String name;
    private double price;
    private static int count = 0;
    private int id;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        id = count;
        count++;
        Shop.addProduct(this);
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getID() {return this.id;}
}