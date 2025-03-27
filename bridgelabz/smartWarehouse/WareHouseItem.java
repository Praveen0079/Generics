package com.bridgelabz.smartWarehouse;

// Abstract class that represents a generic warehouse item
abstract class WarehouseItem {
    private String name;
    private double cost;

    public WarehouseItem(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    // Abstract method to display item details
    public abstract void display();
}

// Electronics category
class Electronics extends WarehouseItem {
    private int warrantyPeriod;

    public Electronics(String name, double cost, int warrantyPeriod) {
        super(name, cost);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void display() {
        System.out.println("Electronics: " + getName() + " | Cost: $" + getCost() + " | Warranty: " + warrantyPeriod + " years");
    }
}

// Groceries category
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, double cost, String expiryDate) {
        super(name, cost);
        this.expiryDate = expiryDate;
    }

    @Override
    public void display() {
        System.out.println("Groceries: " + getName() + " | Cost: $" + getCost() + " | Expiry Date: " + expiryDate);
    }
}

// Furniture category
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double cost, String material) {
        super(name, cost);
        this.material = material;
    }

    @Override
    public void display() {
        System.out.println("Furniture: " + getName() + " | Cost: $" + getCost() + " | Material: " + material);
    }
}
