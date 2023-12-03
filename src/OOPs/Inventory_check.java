package OOPs;

import java.util.ArrayList;

//Write a Java program to create a class called "Inventory" with a collection of products and
// methods to add and remove products, and to check for low inventory
class Inventory {
ArrayList<Product> product;


    public Inventory() {

        this.product = new ArrayList<>();
    }
    ArrayList addProduct(Product products){
        product.add(products);
        return product;
    }
    ArrayList removeProduct(Product products){
        product.remove(products);
        return product;
    }
    void checkLowInventory(){
        for(Product product1: product){
            if(product1.quantity < 100){
                System.out.println("We are running low "+ product1.quantity + product1.products);
            }
        }
    }

}
class Product{
    String products;
    int quantity;

    public Product(String products, int quantity) {
        this.products = products;
        this.quantity = quantity;    }




}
public class Inventory_check {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("LED TV", 200);
        Product product2 = new Product("Mobile", 80);
        Product product3 = new Product("Tablet", 150);
        System.out.println("Add three products in inventory:");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        System.out.println("\nCheck low inventory:");
        inventory.checkLowInventory();
        System.out.println("\nRemove Tablet from the inventory!");
        inventory.removeProduct(product3);
        System.out.println("\nAgain check low inventory:");
        inventory.checkLowInventory();
    }

    }

