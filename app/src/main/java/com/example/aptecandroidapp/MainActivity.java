package com.example.aptecandroidapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String textHolderOne, textHolderTwo;
    int function = 0;

    double finalAnswer = 0;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView myAnswer = findViewById(R.id.answer);
        final TextView historyText = findViewById(R.id.historyText);
        final TextView enteredText = findViewById(R.id.enteredText);


        Button btnOne = findViewById(R.id.btnOne);
        Button btnTwo = findViewById(R.id.btnTwo);
        Button btnThree = findViewById(R.id.btnThree);
        Button btnFour = findViewById(R.id.btnFour);
        Button btnFive = findViewById(R.id.btnFive);
        Button btnSix = findViewById(R.id.btnSix);
        Button btnSeven = findViewById(R.id.btnSeven);
        Button btnEight = findViewById(R.id.btnEight);
        Button btnNine = findViewById(R.id.btnNine);
        Button btnZero = findViewById(R.id.btnZero);
        final Button btnDot = findViewById(R.id.btnDot);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDiv = findViewById(R.id.btnDiv);
        final Button equalBtn = findViewById(R.id.equalBtn);
        equalBtn.setEnabled(false);

        Button clearBtn = findViewById(R.id.clearBtn);






        btnOne.setOnClickListener(new View.OnClickListener() {
        @Override
    public void onClick(View view) {
        enteredText.append("1");
        historyText.append("1");
    }
    });




        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("2");
                historyText.append("2");
            }
        });



        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("3");
                historyText.append("3");
            }
        });


        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("4");
                historyText.append("4");
            }
        });


        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("5");
                historyText.append("5");
            }
        });


        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("6");
                historyText.append("6");
            }
        });


        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("7");
                historyText.append("7");
            }
        });


        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("8");
                historyText.append("8");
            }
        });


        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("9");
                historyText.append("9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append("0");
                historyText.append("0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredText.append(".");
                historyText.append(".");
                btnDot.setEnabled(false);
            }
        });





        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                function = 1;
                historyText.append("/");

                textHolderOne = enteredText.getText().toString();
                textHolderTwo = textHolderOne;
                enteredText.setText("");
                textHolderOne = "";
                equalBtn.setEnabled(true);

            }
        });




        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                function = 2;
                historyText.append("X");

                textHolderOne = enteredText.getText().toString();
                textHolderTwo = textHolderOne;
                enteredText.setText("");
                textHolderOne = "";
                equalBtn.setEnabled(true);
            }
        });



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                function = 3;
                historyText.append("+");

                textHolderOne = enteredText.getText().toString();
                textHolderTwo = textHolderOne;
                enteredText.setText("");
                textHolderOne = "";
                equalBtn.setEnabled(true);
            }
        });



        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                function = 4;
                historyText.append("-");

                textHolderOne = enteredText.getText().toString();
                textHolderTwo = textHolderOne;
                enteredText.setText("");
                textHolderOne = "";
                equalBtn.setEnabled(true);
            }
        });















        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               textHolderOne = enteredText.getText().toString();

                if(function == 1){

                   finalAnswer = Double.parseDouble(textHolderTwo) / Double.parseDouble(textHolderOne);

                }
                else if(function == 2){
                    finalAnswer = Double.parseDouble(textHolderTwo) * Double.parseDouble(textHolderOne);
                }
                else if(function == 3){
                    finalAnswer = Double.parseDouble(textHolderTwo) + Double.parseDouble(textHolderOne);
                }
                else if(function == 4){
                    finalAnswer = Double.parseDouble(textHolderTwo) - Double.parseDouble(textHolderOne);
                }


                myAnswer.setText(String.valueOf(finalAnswer));
                enteredText.setText("");
                equalBtn.setEnabled(false);
            }
        });



    clearBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        myAnswer.setText("0");
        enteredText.setText("");
        equalBtn.setEnabled(false);
        btnDot.setEnabled(true);
        historyText.setText("");
         }
    });

    }}
