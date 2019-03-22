package com.swapna.caloriecounter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Holds information about a meal.
 */
public class Meal {

    private String name;
    private ArrayList<Food> foods = new ArrayList<>();

    public Meal(String name, ArrayList<Food> foods) {
        this.name = name;
        if (foods != null && !foods.isEmpty()) {
            this.foods.addAll(foods);
        }
    }

    // Sum of all getCalories of Foods.
    public double getCalories() {
        return foods.stream()
                .mapToDouble(Food::getCalories)
                .sum();
    }

    // Sum of all getFat of Foods.
    public double getFat() {
        return foods.stream()
                .mapToDouble(Food::getFat)
                .sum();
    }

    // Sum of all getCarbohydrates of Foods.
    public double getCarbohydrates() {
        return foods.stream()
                .mapToDouble(Food::getCarbohydrates)
                .sum();
    }

    // Sum of all getProtein of Foods.
    public double getProtein() {
        return foods.stream()
                .mapToDouble(Food::getProtein)
                .sum();
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getMealTime() {
        return LocalDateTime.now();
    }

    // Print each food in the meal.
    public void viewFoods() {
        this.foods.forEach(food -> {
            System.out.println(food.getName());
        });
    }
}
