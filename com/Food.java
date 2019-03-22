package com.swapna.caloriecounter;

import java.util.ArrayList;

/**
 * Holds information about a food.
 */
public class Food {

    private ArrayList<Category> categories = new ArrayList<>();
    private Consumable consumable;

    public Food(Consumable consumable) {
        this.consumable = consumable;
    }

    public double getCalories() {
        return consumable.getCalories();
    }

    public double getFat() {
        return consumable.getFat();
    }

    public double getCarbohydrates() {
        return consumable.getCarbohydrates();
    }

    public double getProtein() {
        return consumable.getProtein();
    }

    public String getName() {
        return consumable.getName();
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void addCategory(Category category) {
        if (category != null) {
            categories.add(category);
        }
    }
}
