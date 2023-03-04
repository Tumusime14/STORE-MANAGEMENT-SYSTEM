public class Products {
    public int productId;
    public double price;
    public String prodType;

    public Products(int productId, double price, String prodType) {
        this.productId = productId;
        this.price = price;
        this.prodType = prodType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    void AddProduct() {

    }
}
