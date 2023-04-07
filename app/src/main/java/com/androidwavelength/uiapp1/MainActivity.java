package com.androidwavelength.uiapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumberOne, edtNumberTwo;
    private Button btnPlus, btnMinus, btnMultiply, btnDivide;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupListeners();

    }

    private void setupListeners() {
        btnPlus.setOnClickListener(new BtnPlusClickListener());
        btnMinus.setOnClickListener(new BtnMinusClickListener());
        btnMultiply.setOnClickListener(new BtnMultiplyClickListener());
        btnDivide.setOnClickListener(new BtnDivideClickListener());
    }
    private void initViews() {
        txtResult =findViewById(R.id.txtResult);
        edtNumberOne =findViewById(R.id.edtNumberOne);
        edtNumberTwo =findViewById(R.id.edtNumberTwo);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        }
        private class BtnPlusClickListener implements View.OnClickListener{
            @Override
            public void onClick(View view) {
              int NumberOne = Integer.parseInt(edtNumberOne.getText().toString());
              int NumberTwo = Integer.parseInt(edtNumberTwo.getText().toString());

              int Result = NumberOne + NumberTwo;

              txtResult.setText(String.valueOf(Result));

            }
        }
        private class BtnMinusClickListener implements View.OnClickListener{
            @Override
            public void onClick(View view) {
               int NumberOne = Integer.parseInt(edtNumberOne.getText().toString());
               int NumberTwo = Integer.parseInt(edtNumberTwo.getText().toString());

               int Result = NumberOne - NumberTwo;

               txtResult.setText(String.valueOf(Result));
            }
        }
        private class BtnMultiplyClickListener implements View.OnClickListener{
            @Override
            public void onClick(View view) {
               int NumberOne = Integer.parseInt(edtNumberOne.getText().toString());
               int NumberTwo= Integer.parseInt(edtNumberTwo.getText().toString());

               int Result = NumberOne * NumberTwo;

               txtResult.setText(String.valueOf(Result));
            }
        }
        private class BtnDivideClickListener implements View.OnClickListener{
            @Override
            public void onClick(View view) {
                int NumberOne = Integer.parseInt(edtNumberOne.getText().toString());
                int NumberTwo = Integer.parseInt(edtNumberTwo.getText().toString());

                int Result = NumberOne / NumberTwo;

                txtResult.setText(String.valueOf(Result));
            }
        }
}