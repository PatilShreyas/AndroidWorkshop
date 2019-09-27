package com.shreyaspatil.firefast.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    Button buttonAdd, buttonSub, buttonMultiply, buttonDiv;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking UI from layout
        etNum1 = findViewById(R.id.editText_num1);
        etNum2 = findViewById(R.id.editText_num2);

        buttonAdd = findViewById(R.id.button_add);
        buttonSub = findViewById(R.id.button_subtract);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDiv = findViewById(R.id.button_division);

        textResult = findViewById(R.id.textView_result);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get string inputs from EditText fields.
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                try {
                    // Convert String to Integer for operations
                    int x = Integer.parseInt(num1);
                    int y = Integer.parseInt(num2);

                    // Perform Addition
                    int sum = x + y;

                    // Show Result in TextView
                    textResult.setText("Addition = " + sum);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "Enter Valid Numbers",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get string inputs from EditText fields.
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                try {
                    // Convert String to Integer for operations
                    int x = Integer.parseInt(num1);
                    int y = Integer.parseInt(num2);

                    // Perform Subtraction
                    int sub = x - y;

                    // Show Result in TextView
                    textResult.setText("Subtraction = " + sub);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "Enter Valid Numbers",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get string inputs from EditText fields.
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                try {
                    // Convert String to Integer for operations
                    int x = Integer.parseInt(num1);
                    int y = Integer.parseInt(num2);

                    // Perform Multiplication
                    int multiplication = x * y;

                    // Show Result in TextView
                    textResult.setText("Multiplication = " + multiplication);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "Enter Valid Numbers",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get string inputs from EditText fields.
                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                try {
                    // Convert String to Integer for operations
                    int x = Integer.parseInt(num1);
                    int y = Integer.parseInt(num2);

                    // Perform Division
                    double div = (double)x / y;

                    // Show Result in TextView
                    textResult.setText("Division = " + div);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "Enter Valid Numbers",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
