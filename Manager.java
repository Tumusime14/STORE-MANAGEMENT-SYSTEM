public class Manager {
    private int Id;
    private String name;
    private int phoneNum;
    private String address;

    public Manager(int id, String name, int phoneNum, String address) {
        Id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void purchaseProduct(int productId,String productName,int quantity){


    }

}
