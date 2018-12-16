package com.example.cicass.foodvisualizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

    public void pizzaDisplay(View view) {
        Intent foodDisplay = new Intent(this, FoodDisplay.class);
        foodDisplay.putExtra("item", "pizza");
        startActivity(foodDisplay);
    }

    public void LobsterDisplay(View view) {
        Intent foodDisplay = new Intent(this, FoodDisplay.class);
        foodDisplay.putExtra("item", "lobster");
        startActivity(foodDisplay);
    }

    public void threeTacoDisplay(View view) {
        Intent foodDisplay = new Intent(this, FoodDisplay.class);
        foodDisplay.putExtra("item", "threetaco");
        startActivity(foodDisplay);
    }

    public void hamDisplay(View view) {
        Intent foodDisplay = new Intent(this, FoodDisplay.class);
        foodDisplay.putExtra("item", "ham");
        startActivity(foodDisplay);
    }
}
