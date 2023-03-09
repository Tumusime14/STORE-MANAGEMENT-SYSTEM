public class Stock extends Product{
    public int productId;
    public static int quantity;
        

    public Stock(int productId, String productName, int productId2, int quantity) {
        super(productId, productName);
        productId = productId2;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
        public void double calculateTotal(Product products) {
            double total = 0.0;
     Product product;
    total += product.getPrice();
          return total;  }
            
        }
    
