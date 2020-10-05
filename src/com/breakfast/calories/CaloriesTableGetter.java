package com.breakfast.calories;

import com.breakfast.food.FoodType;
import com.breakfast.json.JSONFileReader;

import java.util.HashMap;

import static com.breakfast.food.FoodType.*;

public class CaloriesTableGetter {
    JSONFileReader jsonFileReader;

    public CaloriesTableGetter(String path) {
        jsonFileReader = new JSONFileReader(path);
    }
    public HashMap<FoodType, HashMap<String, Integer>> getCaloriesTable(){
        HashMap<FoodType, HashMap<String, Integer>> caloriesTable = new HashMap<>();
        caloriesTable.put(APPLE, jsonFileReader.getTable(APPLE, new String[]{"size", "calories"}));
        caloriesTable.put(SANDWICH, jsonFileReader.getTable(SANDWICH, new String[]{"filling", "calories"}));
        caloriesTable.put(CHEESE, jsonFileReader.getTable(CHEESE, new String[]{"name", "calories"}));
        return caloriesTable;
    }
}