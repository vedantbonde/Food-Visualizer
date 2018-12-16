package com.example.cicass.foodvisualizer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.ar.sceneform.rendering.ModelRenderable;

public class FoodDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        ModelRenderable.builder()
            .setSource(this, Uri.parse(""))
                .build()
                    .thenAccept(renderable -> andyRenderable = renderable)
                        .exceptionally(
                                throwable -> {
                                    Log.e(TAG, "Unable to load Renderable.", throwable);
                                    return null;
                                });*/
    }
}
