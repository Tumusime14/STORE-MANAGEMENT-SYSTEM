public class Supplier {
    private String supplierId;
    private String supplierName;
    private int supplierTelephone;
    private String SupplierAddress;
    
    public Supplier(String supplierId, String supplierName, int supplierTelephone, String supplierAddress) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierTelephone = supplierTelephone;
        SupplierAddress = supplierAddress;
    }

    public String getSupplierId() {
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
