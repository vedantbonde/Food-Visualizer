package com.example.cicass.foodvisualizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
    }

    protected void onResume() {
        super.onResume();

        getSupportActionBar().hide();
    }

    public void foodDisplay(View view) {
        Intent foodDisplay = new Intent(this, FoodDisplay.class);
        startActivity(foodDisplay);
    }
}
