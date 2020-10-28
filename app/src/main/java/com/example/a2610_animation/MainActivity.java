package com.example.a2610_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable lightsAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgFrame=(ImageView) findViewById(R.id.imgLights);

        imgFrame.setBackgroundResource(R.drawable.animation);
        lightsAnim= (AnimationDrawable) imgFrame.getBackground();

        Button start=(Button) findViewById(R.id.buttonStart);
        Button stop=(Button) findViewById(R.id.buttonStop);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnim.start();

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnim.stop();
                startActivity(new Intent(MainActivity.this, Tween.class));

            }
        });

    }
}