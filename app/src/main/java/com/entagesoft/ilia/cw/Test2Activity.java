package com.entagesoft.ilia.cw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class Test2Activity extends AppCompatActivity {

    HashMap<Integer, Boolean> answers;
    String[] questions;
    Button plusButton, minusButton, plusMinusButton;
    TextView questionTextView, numTextView;
    int i = 0, nature = 0, tech = 0, digit = 0, art = 0, social = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        questionTextView = findViewById(R.id.questionTextView);
        numTextView = findViewById(R.id.numTextView);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        plusMinusButton = findViewById(R.id.plusMinusButton);

        questions = getResources().getStringArray(R.array.professionQuestions);
        answers = new HashMap<Integer, Boolean>();

        questionTextView.setText(questions[i]);  //first initialization

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i == questions.length - 2){

                    calculate(answers);

                    Intent intent = new Intent(getApplicationContext(), resultActivity.class);
                    intent.putExtra("nature", nature);
                    intent.putExtra("tech", tech);
                    intent.putExtra("digit", digit);
                    intent.putExtra("art", art);
                    intent.putExtra("social", social);
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
                    intent.putExtra("nature", nature);
                    intent.putExtra("tech", tech);
                    intent.putExtra("digit", digit);
                    intent.putExtra("art", art);
                    intent.putExtra("social", social);
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

        plusMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i == questions.length - 2){

                    calculate(answers);

                    Intent intent = new Intent(getApplicationContext(), resultActivity.class);
                    intent.putExtra("nature", nature);
                    intent.putExtra("tech", tech);
                    intent.putExtra("digit", digit);
                    intent.putExtra("art", art);
                    intent.putExtra("social", social);
                    startActivity(intent);
                }
                else {

                    //answers.put(i, true);
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

            int f = k + 1;

            if (f == 4 || f == 7 || f == 11 || f == 28) {

                if (a.get(k)) {

                    nature++;
                }
            }

            if (f == 25 || f == 18) {

                if (a.get(k)) {

                    nature = nature + 2;
                }
            }

            if (f == 4 || f == 7 || f == 11 || f == 28 || f == 25 || f == 18) {

                if (!a.get(k)) {

                    nature--;
                }
            }

            if (f == 2 || f == 13 || f == 21 || f == 26) {

                if (a.get(k)) {

                    tech++;
                }
            }

            if (f == 9 || f == 16) {

                if (a.get(k)) {

                    tech = tech + 2;
                }
            }

            if (f == 2 || f == 13 || f == 21 || f == 26 || f == 9 || f == 16) {

                if (!a.get(k)) {

                    tech--;
                }
            }

            if (f == 29 || f == 22 || f == 8 || f == 5) {

                if (a.get(k)) {

                    digit++;
                }
            }

            if (f == 19 || f == 14) {

                if (a.get(k)) {

                    digit = digit + 2;
                }
            }

            if (f ==29 || f == 22 || f == 8 || f == 5 || f == 19 || f == 14) {

                if (!a.get(k)) {

                    digit--;
                }
            }

            if (f == 30 || f == 24 || f == 12 || f == 3) {

                if (a.get(k)) {

                    art++;
                }
            }

            if (f == 17 || f == 10) {

                if (a.get(k)) {

                    art = art + 2;
                }
            }

            if (f == 30 || f == 24 || f == 12 || f == 3 || f == 17 || f == 10) {

                if (!a.get(k)) {

                    art--;
                }
            }

            if (f == 1 || f == 6 || f == 20 || f == 27) {

                if (a.get(k)) {

                    social++;
                }
            }

            if (f == 15 || f == 23) {

                if (a.get(k)) {

                    social = social + 2;
                }
            }

            if (f == 1 || f == 6 || f == 20 || f == 27 || f == 15 || f == 23) {

                if (!a.get(k)) {

                    social--;
                }
            }




        }
    }

}
