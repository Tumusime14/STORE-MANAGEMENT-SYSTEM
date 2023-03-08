public class Supplier extends Manager{
    private static String supplierId;
    private String supplierName;
    private int supplierTelephone;
    private String SupplierAddress;
    
   

    public Supplier(int id, String name, int phoneNum, String address, String supplierId, String supplierName,
            int supplierTelephone) {
        super(id, name, phoneNum, address);
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierTelephone = supplierTelephone;
    }

    public static String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierTelephone() {
        return supplierTelephone;
    }

    public void setSupplierTelephone(int supplierTelephone) {
        this.supplierTelephone = supplierTelephone;
    }

    public String getSupplierAddress() {
        return SupplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        SupplierAddress = supplierAddress;
    }

    

    
}
