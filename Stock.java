public class Stock {
    public int productId;
    public int quantity;
    public int shopId;

    public Stock(int productId, int quantity, int shopId) {
        this.productId = productId;
        this.quantity = quantity;
        this.shopId = shopId;
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

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

}