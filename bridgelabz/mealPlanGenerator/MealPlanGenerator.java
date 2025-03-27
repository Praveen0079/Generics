package com.bridgelabz.mealPlanGenerator;

import java.util.List;
public class MealPlanGenerator {
    // Generic method to generate and display meal plans
    public static <T extends MealPlan> void generateMealPlan(List<T> meals){
        System.out.println("\n--- Generated Meal Plan ---");
        for(int i=0;i<meals.size();i++){
            System.out.println("Meal" + (i+1) + ": ");
            meals.get(i).displayMeal();
        }
    }
}
