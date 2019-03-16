package com.example.ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int[] arrayRed = {Color.rgb(240, 0, 0),
                Color.rgb(215, 0, 0),
                Color.rgb(190, 0, 0),
                Color.rgb(150, 0, 0),
                Color.rgb(120, 0, 0),
                Color.rgb(95, 0, 0)};

        int[] arrayBlue = {Color.rgb(0, 0, 240),
                Color.rgb(0, 0, 215),
                Color.rgb(0, 0, 190),
                Color.rgb(0, 0, 150),
                Color.rgb(0, 0, 120),
                Color.rgb(0, 0, 95)};

        int[] arrayGreen = {Color.rgb(0, 240, 0),
                Color.rgb(0, 215, 0),
                Color.rgb(0, 190, 0),
                Color.rgb(0, 150, 0),
                Color.rgb(0, 120, 0),
                Color.rgb(0, 95, 0)};


        int viewId = v.getId();

        switch (viewId) {
            case R.id.button1: {
                button1.setBackgroundColor(arrayRed[(int) (Math.random()*6)]);
                break;
            }
            case R.id.button2: {
                button2.setBackgroundColor(arrayBlue[(int) (Math.random()*6)]);
                break;
            }
            case R.id.button3: {
                button3.setBackgroundColor(arrayGreen[(int) (Math.random()*6)]);
                break;
            }
        }
    }
}
