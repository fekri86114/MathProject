package com.mrfekri.mathArea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AppCompatButton buttonCircle, buttonSquare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCircle = findViewById(R.id.button_circle);
        buttonSquare = findViewById(R.id.button_square);
        buttonCircle.setOnClickListener(this);
        buttonSquare.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_circle:
                startActivity(new Intent(MainActivity.this, CircleActivity.class));
                break;
            case R.id.button_square:
                startActivity(new Intent(MainActivity.this, SquareActivity.class));
                break;

            default:
                Toast.makeText(MainActivity.this, "No Button clicked.", Toast.LENGTH_SHORT).show();

        }
    }
}