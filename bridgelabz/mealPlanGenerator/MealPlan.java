package com.bridgelabz.mealPlanGenerator;

// Interface for all types
interface MealPlan{
    void displayMeal();
}

// Meal types

// Vegetarian Meal

class VegetarianMeal implements MealPlan{
    public void displayMeal(){
        System.out.println("Vegetarian Meal: Roasted Paneer");
    }
}

// Vegan Meal
class VeganMeal implements MealPlan{
    public void displayMeal(){
        System.out.println("Vegan Meal: Vegan Rice");
    }
}

// High Protein Meal
class HighProteinMeal implements MealPlan{
    public void displayMeal(){
        System.out.println("High-Protein Meal: Boiled lemon chicken");
    }
}