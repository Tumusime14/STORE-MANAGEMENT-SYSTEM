import java.util.Scanner;

import Product.ProductList;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 5:");
        System.out.println("1. Purchase from Supplier");
        System.out.println("2. Sell product to customer");
        System.out.println("3. Pay supplier");
        System.out.println("4. Purchase from Supplier");
        System.out.println("5. Terminate");

        int choice = scanner.nextInt();
    
        switch (choice) {
          case 1:
          Supplier.getSupplierId();

            System.out.println("You have successful stored product");
            break;
          case 2:
          Transaction.generateReceipt(Product[] products, )
            System.out.println("You chose option 2");
            break;
          case 3:
            System.out.println("You chose option 3");
            break;
          case 4:
            System.out.println("You chose option 4");
            break;
            case 5:
            System.exit(0);
            break;
          default:
            System.out.println("Invalid choice");
            break;
        }


    }

}
