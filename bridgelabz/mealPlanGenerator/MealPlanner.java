package com.bridgelabz.mealPlanGenerator;

import java.util.Arrays;
import java.util.List;

public class MealPlanner {
    public static void main(String[] args) {
        // Create different meal types
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        HighProteinMeal protein = new HighProteinMeal();

        // Use generic Meal class
        Meal<VegetarianMeal> meal1 = new Meal<>(veg);
        Meal<VeganMeal> meal2 = new Meal<>(vegan);
        Meal<HighProteinMeal> meal4 = new Meal<>(protein);

        // Display individual meals
        System.out.println("\n----- Individual Meal Details -----");
        meal1.showMealDetails();
        meal2.showMealDetails();
        meal4.showMealDetails();

        // Generate meal plan using utility class
        List<MealPlan> mealList = Arrays.asList(veg, vegan, protein);
        MealPlanGenerator.generateMealPlan(mealList);
    }
}
