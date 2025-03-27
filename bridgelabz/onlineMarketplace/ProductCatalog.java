package com.bridgelabz.onlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Enum<T>> {
    private List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public void displayCatalog() {
        System.out.println("\n--- Product Catalog ---");
        for (int i = 0; i < products.size(); i++) {
            products.get(i).displayProduct();
        }
    }
}
