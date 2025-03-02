import java.util.Scanner;

public class Product {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public int getPid() {
        return pid;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}

class XYZ {
    public static Product[] getProductsFromUser() {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }
        scanner.close();
        return products;
    }
    public static int findProductWithHighestPrice(Product[] products) {
        int maxPricePid = products[0].getPid();
        double maxPrice = products[0].getPrice();

        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPricePid = product.getPid();
            }
        }
        return maxPricePid;
    }
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
    public static void main(String[] args) {
        Product[] products = getProductsFromUser();
        int maxPricePid = findProductWithHighestPrice(products);
        System.out.println("Product ID with the highest price: " + maxPricePid);
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }
}

// Output
Enter details for product 1:
Product ID: 1
Price: 25
Quantity: 2
Enter details for product 2:
Product ID: 2
Price: 50
Quantity: 3
Enter details for product 3:
Product ID: 3
Price: 90
Quantity: 5
Enter details for product 4:
Product ID: 4
Price: 60
Quantity: 5
Enter details for product 5:
Product ID: 5
Price: 80
Quantity: 6
Product ID with the highest price: 3
Total amount spent on all products: 1430.0
