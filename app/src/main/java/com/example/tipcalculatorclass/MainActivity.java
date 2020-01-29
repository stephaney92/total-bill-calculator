package com.example.tipcalculatorclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    //initializing
    private EditText totalNumPeople;
    private EditText totalCostBeforeTip;
    private EditText splitTotal;
    private RadioButton eighteenButton;
    private RadioButton twentyButton;
    private RadioButton twentyFiveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding id
        totalNumPeople = findViewById(R.id.totalNumPeople);
        totalCostBeforeTip = findViewById(R.id.totalCostBeforeTip);
        splitTotal = findViewById(R.id.splitTotal);
        eighteenButton = findViewById(R.id.eighteenButton);
        twentyButton = findViewById(R.id.twentyButton);
        twentyFiveButton = findViewById(R.id.twentyFiveButton);
    }
    public void tipCalc(View v){
        if (eighteenButton.isChecked()) {

            //taking number and turning into a string
            String inputCostBeforeTip = totalCostBeforeTip.getText().toString();
            if (inputCostBeforeTip.length() > 0) {
                //turns string into number
                double costBeforeValue = Double.parseDouble(inputCostBeforeTip);
                double costValue = costBeforeValue * 0.18;
                //calculates in the line the split total line
                splitTotal.setText(String.format("%.1f", costValue));
                }
            }
        }
    }
