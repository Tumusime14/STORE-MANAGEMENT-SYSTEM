
import java.util.ArrayList;
import java.util.List;

public class Product extends Stock{
    private int productId;
    private String productName;
    private int quantity;

    public Product(int productId,int shopId, String productName, int quantity) {
        super(productId, quantity, shopId);
        this.productId = productId;
        this.shopId = shopId;
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
public class ProductList{
    private List<Product> productList = new ArrayList<>();

    public void Addproduct(int productId, String productName,int quantity){
        Product product = new Product(productId, quantity, productName, quantity);
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

}