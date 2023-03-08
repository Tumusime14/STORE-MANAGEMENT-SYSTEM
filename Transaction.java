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
void purchasee(){
    public double calculateTotal(Product[] products) {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    public String generateReceipt(Product[] products, double total, PaymentMethod paymentMethod) {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Transaction Receipt:\n\n");
        for (Product product : products) {
            receipt.append(product.getPrice() + " - $" + product.getPrice() + "\n");
        }
        receipt.append("\nTotal: $" + total + "\n");
        receipt.append("Payment Method: " + paymentMethod + "\n");
        receipt.append("Thank you for your purchase!\n");
        return receipt.toString();
    }
}

}