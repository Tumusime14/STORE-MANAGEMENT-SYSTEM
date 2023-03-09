public class Product extends Stock {

    private String productName;

    private int productId;

    private static int quantity;
    private double price;

    public Product(int productId, int quantity, String productName, double price, int size) {
        super(0, quantity);
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;

        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Product.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product id " + getProductId());
        System.out.println("Product name " + getProductName());
        System.out.println("Product quantity " + getQuantity());

    }

}