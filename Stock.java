import java.util.Arrays;

public class Stock{

    private int stocksize;
    private Product [] products;
    private int quantity;
    private int count;

    public Stock(int stocksize, int quantity) {

        products = new Product[10];
    }
    public void addProduct(Product product){
        products[count++] = product;
        System.out.println("Product  successfull added!  ");
    }
            
        }
    
