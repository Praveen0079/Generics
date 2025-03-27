package com.bridgelabz.smartWarehouse;

import java.util.ArrayList;
import java.util.List;

// Generic storage class is restricted to WarehouseItem and its subclasses
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Add an item to storage
    public void addItem(T item) {
        items.add(item);
    }

    // Get an item using index
    public T getItem(int idx) {
        return items.get(idx);
    }

    // Display all items using wildcard
    public static void displayItems(List<? extends WarehouseItem> items) {
        for(int i = 0; i < items.size(); i++) {
            items.get(i).display();
        }
    }

    public List<T> getItems() {
        return items;
    }
}
