public class Customer {
    private int customerId;
    private String customerName;
    private double balance = 10000;
    private String address;
    private String phone;

    public Customer(int customerId, String customerName,double balance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

  public void buyProduct(Product product, Customer customer) {
    double price = product.getPrice();
    double balance = customer.getBalance();
    
    if (balance >= price) {
        customer.setBalance(balance - price); 
        product.setStock(product.getStock() - 1);
        System.out.println("Purchase successful! Your new balance is: " + customer.getBalance());
    } else {
        
        System.out.println("Purchase failed! You do not have enough balance to buy this product.");
    }
}
}
