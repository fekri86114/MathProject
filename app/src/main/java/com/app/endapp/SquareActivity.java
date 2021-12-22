package com.app.endapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

public class SquareActivity extends AppCompatActivity {
    private AppCompatEditText editSide;
    private AppCompatButton buttonCalculate;
    private AppCompatTextView textAreaResult, textPerimeterResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        editSide = findViewById(R.id.edit_side);
        buttonCalculate = findViewById(R.id.button_calculate);
        textAreaResult = findViewById(R.id.text_area_result);
        textPerimeterResult = findViewById(R.id.text_perimeter_result);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double side = Double.parseDouble(editSide.getText().toString());
                textAreaResult.setText("Area Result is: " + side * side);
                textPerimeterResult.setText("Perimeter Result is: " + 4 * side);

            }
        });

    }
}