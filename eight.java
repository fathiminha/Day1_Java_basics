/* 8) implement classes for the given scenario:
	- A reatail store which can store,edit,and delete 
multible products like fruits, vegetables, grocery, etc..
	- display the avilabe products like price, name, 
	quantity */

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println(name + " - Rs." + price + " - Qty: " + quantity);
    }
}

class RetailStore {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product\n2. Display Products\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    products.add(new Product(name, price, quantity));
                    System.out.println("Product added!");
                    break;
                case 2:
                    if (products.isEmpty()) {
                        System.out.println("No products available!");
                    } else {
                        for (Product p : products) {
                            p.display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
