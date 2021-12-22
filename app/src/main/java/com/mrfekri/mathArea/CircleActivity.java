package com.mrfekri.mathArea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

public class CircleActivity extends AppCompatActivity {
    private AppCompatEditText editRadius;
    private AppCompatButton buttonCalculate;
    private AppCompatTextView textAreaResult, textPerimeterResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        editRadius = findViewById(R.id.edit_radius);
        buttonCalculate = findViewById(R.id.button_calculate);
        textAreaResult = findViewById(R.id.text_area_result);
        textPerimeterResult = findViewById(R.id.text_perimeter_result);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double radius = Double.parseDouble(editRadius.getText().toString());
                textAreaResult.setText("Area Result is: " + 3.14 * radius * radius);
                textPerimeterResult.setText("Perimeter Result is: " + 2 * 3.14 * radius);
            }
        });
    }
}