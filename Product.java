public class Product extends Stock{
    private int productId;
    private String productName;
    private static int quantity;
    private double price;

    public Product(int productId,String productName) {
        super(productId, quantity, productId);
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void Addproduct(int productId, String productName,int quantity){
        Product product = new Product(productId, productName);
        productList.add(product);

    }
}
public boolean deleteProduct(int productId){
    return false;
    
}

public double getPrice() {
    return 0;
}

public int getStock() {
    return 0;
}

public void setStock(int i) {
}

public static Product purchaseProduct() {
    return null;
}

}