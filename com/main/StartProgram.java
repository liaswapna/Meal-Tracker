package com.main;

import com.Category;
import com.Consumable;
import com.Food;
import com.Meal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StartProgram {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.print("Enter your age (integer): ");
        Integer age = Integer.valueOf(reader.readLine());

        System.out.print("Enter your email: ");
        String email = reader.readLine();

        System.out.print("Enter your Target (in percentage): ");
        Float targetAdherence = Float.valueOf(reader.readLine()) / 100;

        User user = new User(name, age, email, targetAdherence);

        boolean needMeals = true;

        while(needMeals) {
            System.out.print("Enter your meal name: ");
            String mealName = reader.readLine();

            boolean moreFood = true;
            ArrayList<Food> foods = new ArrayList<>();
            while(moreFood) {
                System.out.print("Enter your food name: ");
                String foodName = reader.readLine();

                System.out.print("What category is your food (Fruit=1, Vegetable=2, Protein=3, Fat=4, Beverage={any key}): ");
                String category = reader.readLine();
                Category foodCategory = null;
                switch (category) {
                    case "1": {
                        foodCategory = Category.Fruit;
                        break;
                    }
                    case "2": {
                        foodCategory = Category.Vegetable;
                        break;
                    }
                    case "3": {
                        foodCategory = Category.Protein;
                        break;
                    }
                    case "4": {
                        foodCategory = Category.Fat;
                        break;
                    }
                    default: {
                        foodCategory = Category.Beverage;
                        break;
                    }
                }
                final Food food = new Food(new Consumable(0d, 0d, 0d, 0d, foodName));
                food.addCategory(foodCategory);
                foods.add(food);

                System.out.print("More food? (y/N): ");
                String continueFood = reader.readLine();
                if (!continueFood.equalsIgnoreCase("y")) {
                    moreFood = false;
                }
            }

            user.consume(new Meal(mealName, foods));
            System.out.print("More meals? (y/N): ");
            String continueMeals = reader.readLine();
            if (!continueMeals.equalsIgnoreCase("y")) {
                needMeals = false;
            }
        }
        user.getMealTracker().viewMeals();

        if (user.getMealTracker().isOnTrack(user.getTargetAdherence())) {
            System.out.println(user.getName() + " is on track to meet goal.");
        } else {
            System.out.println(user.getName() + " is not on track to meet goal.");
        }
    }
}
