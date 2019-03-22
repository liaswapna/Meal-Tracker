package com.swapna.caloriecounter;

/**
 * The attributes of anything that can be consumed / eaten.
 */
public class Consumable {

    private double calories;
    private double fat;
    private double carbohydrates;
    private double protein;
    private String name;

    public Consumable(double calories, double carbohydrates, double fat, double protein, String name) {
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public String getName() {
        return name;
    }

}
