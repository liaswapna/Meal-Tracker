package com.main;

import com.Category;
import com.Food;
import com.Meal;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * The MealTracker class is responsible for collecting all of the meals a User has eaten.
 * As such, each MealTracker maintains a reference to a User
 */
public class MealTracker {

    private ArrayList<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        if (meal != null) {
            meals.add(meal);
        }
    }

    /**
     * Print the name of each meal in the MealTracker
     */
    public void viewMeals() {
        meals.forEach(meal -> {
            String mealTimeString = meal.getMealTime()
                    .format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
            System.out.println(mealTimeString + ": " + meal.getName());
        });
    }

    public int getMealCount() {
        return meals.size();
    }

    /**
     * Adherence refers to what percentage of Meals are "complete" — i.e.,
     * what percentage of meals contain Fruits, Vegetables, Protein, and Fat.
     */
    public double getAdherence() {

        int satisfiedCount = 0;
        for (Meal meal : meals) {
            //Get all the categories of the meal.
            ArrayList<Category> categories = new ArrayList<>();
            for (Food food : meal.getFoods()) {
                categories.addAll(food.getCategories());
            }
            // Check if the meal is satisfied.
            satisfiedCount += satisfiedMeal(categories);
        }
        return (double) satisfiedCount / meals.size();
    }

    /**
     * This determines whether this User's adherence is above their "threshold."
     *
     * @return true if equal or above User's threshold.
     */
    public boolean isOnTrack(float targetAdherence) {
        return getAdherence() >= (double) targetAdherence;
    }

    private int satisfiedMeal(final ArrayList<Category> categories) {
        if (categories.contains(Category.Fat) &&
                categories.contains(Category.Fruit) &&
                categories.contains(Category.Protein) &&
                categories.contains(Category.Vegetable)) {
            return 1;
        }
        return 0;
    }
}
