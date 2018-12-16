package com.example.cicass.foodvisualizer;

public class FoodItem {
    String name;
    String thumbnail = "";
    boolean vegetarian = true;
    String description = "";

    int[] dimensions = {0, 0};

    FoodItem(String name) {
        this.name = name;
    }
}
