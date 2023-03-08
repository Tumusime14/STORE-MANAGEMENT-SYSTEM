public class Transaction extends Product {
    private double price;
    private int quantity;
    public Transaction(int productId, String productName, double price, int quantity) {
        super(productId, productName);
        this.price = price;
        this.quantity = quantity;
    }

    public Transaction(int productId, int shopId, String productName, double price) {
        super(productId, productName);
        this.price = price;
    }
        
    public Transaction(int productId, int shopId, String productName, int quantity) {
        super(productId, productName);
    }
    public void Purchase() {
        double price;
        int quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;

        System.out.println(quantity);
    
}
}