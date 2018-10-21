package com.example.mssoft1650.radiobuttonoptions;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton bigSize = findViewById(R.id.big);
        RadioButton smallSize = findViewById(R.id.small);
        RadioButton blueColor = findViewById(R.id.blue);
        RadioButton redColor = findViewById(R.id.red);
        final TextView TDisplay = findViewById(R.id.tview);


        bigSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TDisplay.setTextSize(30);
            }
        });
        smallSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TDisplay.setTextSize(10);
            }
        });
        blueColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TDisplay.setTextColor(getResources().getColor(R.color.blue));
            }
        });
        redColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TDisplay.setTextColor(getResources().getColor(R.color.red));
            }
        });
    }
}
