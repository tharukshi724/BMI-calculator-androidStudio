package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myButtonListenerMethod(){

        Button button = (Button)findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                final EditText heightText = (EditText)findViewById(R.id.editTextNumberDecimal);
                String heightstr = heightText.getText().toString();

                double height = Double.parseDouble(heightstr);

                final EditText weightText = (EditText)findViewById(R.id.editTextNumberDecimal2);
                String weightstr = weightText.getText().toString();
                double weight = Double.parseDouble(weightstr);

                double BMI =(weight)/ (height*height);
                final EditText BMIResult = (EditText)findViewById(R.id.editTextNumberDecimal3);
                BMIResult.setText(Double.toString(BMI));

                String BMI_cat;

                  if(BMI < 15)
                       BMI_cat = "Very severely underweight";
                  else if(BMI <16)
                       BMI_cat = "severely underweight";
                  else if(BMI <18.5)
                      BMI_cat = "underweight";
                  else if(BMI <25)
                      BMI_cat = "normal";
                  else if(BMI < 30)
                      BMI_cat = "overweight";
                  else if(BMI <35)
                      BMI_cat = "moderately obese";
                  else if(BMI <40)
                      BMI_cat = "severely obese";
                  else
                      BMI_cat = "very severely obese";

                  final TextView BMICategory = (TextView)findViewById(R.id.textView10);
                  BMICategory.setText(BMI_cat);
            }
        });
    }
}