javac *.java
public class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productId, String productName, double price, int quantity) {

        if (productId <= 0) {
            throw new IllegalArgumentException("Product ID must be positive!");
        }

        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty!");
        }

        if (price < 0 || Double.isNaN(price) || Double.isInfinite(price)) {
            throw new IllegalArgumentException("Invalid product price!");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative!");
        }

        this.productId = productId;
        this.productName = productName.trim();
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setProductName(String productName) {

        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty!");
        }

        this.productName = productName.trim();
    }

    public void setPrice(double price) {

        if (price < 0 || Double.isNaN(price) || Double.isInfinite(price)) {
            throw new IllegalArgumentException("Invalid product price!");
        }

        this.price = price;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative!");
        }

        this.quantity = quantity;
    }
}
