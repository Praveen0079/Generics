package com.bridgelabz.smartWarehouse;

public class WarehouseSystem {
    public static void main(String[] args) {
        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items to storage with cost attribute
        electronicsStorage.addItem(new Electronics("LED", 1000, 2));
        electronicsStorage.addItem(new Electronics("SmartTV", 5555, 3));

        groceriesStorage.addItem(new Groceries("Banana", 1.2, "2025-02-02"));
        groceriesStorage.addItem(new Groceries("Water", 3, "2025-05-30"));

        furnitureStorage.addItem(new Furniture("DressingTable", 30.50, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 300.75, "Metal"));

        // Display all items using wildcard method
        System.out.println("--------Electronics Storage ---------");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\n--------- Groceries Storage ------------");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\n-------- Furniture Storage --------------");
        Storage.displayItems(furnitureStorage.getItems());
    }
}



