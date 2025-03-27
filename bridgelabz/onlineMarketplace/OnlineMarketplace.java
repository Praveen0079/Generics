package com.bridgelabz.onlineMarketplace;

public class OnlineMarketplace {
    public static void main(String[] args) {
        // Create products
        Product<BookCategory> book1 = new Product<>("The Alchemist", 21.75, BookCategory.FICTION);
        Product<ClothingCategory> clothing1 = new Product<>("T-Shirt", 15.50, ClothingCategory.MEN);
        Product<GadgetCategory> gadget1 = new Product<>("Smartphone", 299.99, GadgetCategory.MOBILE);

        // Create catalogs
        ProductCatalog<BookCategory> bookCatalog = new ProductCatalog<>();
        ProductCatalog<ClothingCategory> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<GadgetCategory> gadgetCatalog = new ProductCatalog<>();

        // Add products to catalogs
        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(clothing1);
        gadgetCatalog.addProduct(gadget1);

        // Display catalogs
        bookCatalog.displayCatalog();
        clothingCatalog.displayCatalog();
        gadgetCatalog.displayCatalog();

        // Apply discounts
        System.out.println("\nApplying Discounts...");
        ProductUtils.applyDiscount(book1, 10);  // 10% discount on book
        ProductUtils.applyDiscount(clothing1, 30);  // 5% discount on clothing
        ProductUtils.applyDiscount(gadget1, 8);  // 15% discount on gadget

        // Display updated catalogs
        bookCatalog.displayCatalog();
        clothingCatalog.displayCatalog();
        gadgetCatalog.displayCatalog();
    }
}
