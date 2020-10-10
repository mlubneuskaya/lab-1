package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;


public class Cheese extends Food {

    public Cheese() {
        super("cheese");
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            return this.getName().equals(((Food) object).getName());
        }
        return false;
    }

    @Override
    public int calculateCalories() {
        CaloriesCalculator calculator = new CaloriesCalculator();
        return calculator.calculateItemCalories(this);
    }
}
