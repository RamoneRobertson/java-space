package main;

import inventory.*;
//import inventory.Inventory;
//import inventory.Product;
//import inventory.Warehouse;

public class Main {
    public static void main(String [] args){
        Inventory inventory1 = new Inventory();
        Product product1 = new Product();
        Warehouse warehouse1 = new Warehouse();

        // Product fields definition
        product1.productId = 123456;
        product1.productName = "ketchup";
        product1.price = 4.75;

        // Inventory fields definition
        inventory1.product = product1;
        inventory1.quantity = 2500;


        // Warehouse field definitions
        warehouse1.warehouseId = 123987;
        warehouse1.warehouseName = "Kobe Port Central";
        warehouse1.inventories = "inventory1";

        // Print everything out
        System.out.println(product1.productId);

    }
}