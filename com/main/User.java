package com.main;

import com.Meal;

/**
 * Holds information about a user.
 */
public class User {

    private String name;
    private String email;
    private int age;
    private MealTracker mealTracker = new MealTracker();
    private float targetAdherence;

    public User(final String name, final Integer age, final String email, final Float targetAdherence) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.targetAdherence = targetAdherence;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public float getTargetAdherence() {
        return targetAdherence;
    }

    public void setTargetAdherence(final float targetAdherence) {
        this.targetAdherence = targetAdherence;
    }

    public void consume(Meal meal) {
        mealTracker.addMeal(meal);
    }

    public MealTracker getMealTracker() {
        return mealTracker;
    }
}
