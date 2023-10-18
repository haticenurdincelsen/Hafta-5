public class Product {
    private int id;
    private double price;
    private int discount;
    private int Stock;
    private String name;

    public Product(int id, double price, int discount, int Stock, String name) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.Stock = Stock;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
