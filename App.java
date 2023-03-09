import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 5:");
        System.out.println("1.To view products");
        System.out.println("2. Add Product");
        System.out.println("3. Pay supplier");
        System.out.println("4. Purchase from Supplier");
        System.out.println("5. Terminate");

        int choice = scanner.nextInt();

        Stock st1 = new Stock(2, 900);
        Product p1 = new Product(001,5,"Beans",1200,7);
    
        switch (choice) {
          case 1:
              System.out.println("yeah");
            break;
          case 2:
              st1.addProduct(p1);
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
