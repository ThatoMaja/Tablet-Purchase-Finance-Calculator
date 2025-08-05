package com.week1.question3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText editName, editMessage, editChoice;
    TextView textResult;
    Button buttonCalculate, buttonQuit;


    private static final double TABLET_A_PRICE = 2500.0;
    private static final double TABLET_B_PRICE = 3500.0;
    private static final double TABLET_C_PRICE = 4500.0;
    private static final double INTEREST_RATE = 85.4;
    private static final int INSTALLMENTS = 24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editMessage = findViewById(R.id.editMessage);
        editChoice = findViewById(R.id.editChoice);
        textResult = findViewById(R.id.textResult);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonQuit = findViewById(R.id.buttonQuit);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { calculateFinance(); }
        });

        buttonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish(); }
        });
    }

    private void calculateFinance() {
        String name = editName.getText().toString().trim();
        String message = editMessage.getText().toString().trim();
        String choiceStr = editChoice.getText().toString().trim();

        if (name.isEmpty() || message.isEmpty() || choiceStr.isEmpty()) {
            textResult.setText("Please complete all the fields.");
            return;
        }

        try {
            double price = 0.0;
            boolean validChoice = true;

            if (choiceStr.equals("S")) {
                price = TABLET_A_PRICE;
            } else if (choiceStr.equals("M")) {
                price = TABLET_B_PRICE;
            } else if (choiceStr.equals("L")) {
                price = TABLET_C_PRICE;
            } else {
                validChoice = false;
                textResult.setText("Invalid choice! Please select S, M, or L.");
            }

            if (validChoice) {
                double totalCreditPrice = price + (price * INTEREST_RATE / 100);
                double monthlyInstallment = totalCreditPrice / INSTALLMENTS;

            DecimalFormat df = new DecimalFormat("R #,##0.00");
            String result = "Hello " + name + "\n" +
                    "Custom Message: " + message + "\n" +
                    "Monthly Installment: " + df.format(monthlyInstallment) + "\n" +
                    "Total Credit Price: " + df.format(totalCreditPrice) ;

                textResult.setText(result);
            }

        } catch (Exception e) {
            textResult.setText("Invalid input! Please enter an alphabetic letter to select your choice.");
        }
    }
}
