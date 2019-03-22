package com.swapna.caloriecounter.main;

/**
 * Holds information about a user.
 */
public class User {

    private String name;
    private String email;
    private int age;
    private MealTracker mealTracker;
    private float targetAdherence;

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
}
