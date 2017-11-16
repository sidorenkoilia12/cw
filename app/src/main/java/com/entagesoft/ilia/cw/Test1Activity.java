package com.entagesoft.ilia.cw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class Test1Activity extends AppCompatActivity {

    HashMap <Integer, Boolean> answers;
    String[] questions;
    Button plusButton, minusButton;
    TextView questionTextView, numTextView;
    int i = 0, temperament = 0, nervous = 0, lie = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        questionTextView = findViewById(R.id.questionTextView);
        numTextView = findViewById(R.id.numTextView);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);

        questions = getResources().getStringArray(R.array.questions);
        answers = new HashMap<Integer, Boolean>();

        questionTextView.setText(questions[i]);  //first initialization

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i == questions.length - 2){

                    calculate(answers);

                    Intent intent = new Intent(getApplicationContext(), resultActivity.class);
                    intent.putExtra("temperament", temperament);
                    intent.putExtra("nervous", nervous);
                    intent.putExtra("lie", lie);
                    startActivity(intent);
                }
                else {

                    answers.put(i, true);
                    i++;
                    questionTextView.setText(questions[i]);
                    int l = i + 1;
                    numTextView.setText("#" + l);
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i == questions.length - 2){

                    calculate(answers);

                    Intent intent = new Intent(getApplicationContext(), resultActivity.class);
                    intent.putExtra("temperament", temperament);
                    intent.putExtra("nervous", nervous);
                    intent.putExtra("lie", lie);
                    startActivity(intent);
                }
                else {

                    answers.put(i, false);
                    i++;
                    questionTextView.setText(questions[i]);
                    int l = i + 1;
                    numTextView.setText("#" + l);
                }
            }
        });
    }


    public void calculate(HashMap<Integer, Boolean> a){


        for(int k = 0; k < a.size(); k++) {

            if(k + 1 == 1 || k + 1 == 3 || k + 1 == 8 || k + 1 == 10 || k + 1 == 13 || k + 1 == 17 || k + 1 == 22 || k + 1 == 25
                    || k + 1 == 27 || k + 1 == 39 || k + 1 == 44 || k + 1 == 46 || k + 1 == 49 || k + 1 == 53 || k + 1 == 56){

                if(a.get(k)){

                    temperament++;
                }
            }

            if(k + 1 == 5 || k + 1 == 15 || k + 1 == 20 || k + 1 == 29 || k + 1 == 32 || k + 1 == 34 || k + 1 == 37 || k + 1 == 41
                    || k + 1 == 51){

                if(!a.get(k)){

                    temperament++;
                }
            }

            if( k + 1 == 2 || k + 1 == 4 || k + 1 == 7 || k + 1 == 9 || k + 1 == 11 || k + 1 == 14 || k + 1 == 16 || k + 1 == 19
                    || k + 1 == 21 || k + 1 == 23 || k + 1 == 26 || k + 1 == 28 || k + 1 == 31 || k + 1 == 33 || k + 1 == 35
                    || k + 1 == 38 || k + 1 == 40 || k + 1 == 43 || k + 1 == 45 || k + 1 == 47 || k + 1 == 50 || k + 1 == 52
                    || k + 1 == 55 || k + 1 == 57){

                if(a.get(k)){

                    nervous++;
                }
            }

            if( k + 1 == 6 || k + 1 == 24 || k + 1 == 36){

                if(a.get(k)){

                    lie++;
                }
            }

            if( k + 1 == 12 || k + 1 == 18 || k + 1 == 30 || k + 1 == 42 || k + 1 == 48 || k + 1 == 54){

                if(!a.get(k)){

                    lie++;
                }
            }


            Boolean q = a.get(12);
        }
    }
}
