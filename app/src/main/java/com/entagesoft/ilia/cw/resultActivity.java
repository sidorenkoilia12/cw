package com.entagesoft.ilia.cw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    int temperament, nervous, lie, tech, digit, social, art, nature;
    TextView temperamentTextView, nervousTextView, lieTextView, p1, p2, p3, p4, p5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);

        temperamentTextView = findViewById(R.id.temperament);
        nervousTextView = findViewById(R.id.nervous);
        lieTextView = findViewById(R.id.lie);

        Intent intent = getIntent();

        temperament = intent.getIntExtra("temperament", -1);
        nervous = intent.getIntExtra("nervous", -1);
        lie = intent.getIntExtra("lie", -1);

        nature = intent.getIntExtra("nature", -111);
        art = intent.getIntExtra("art", -111);
        tech = intent.getIntExtra("tech", -111);
        social = intent.getIntExtra("social", -111);
        digit = intent.getIntExtra("digit", -111);

        if(nature != -111) {

            p1.setText("Человек - Природа:" + nature);
            p2.setText("Человек - Техника:" + tech);
            p3.setText("Человек - Цифры:" + digit);
            p4.setText("Человек - Исскуство:" + art);
            p5.setText("Человек - Человек:" + social);
        }



        // tut mozjno dobavit prosto if dlia vseh usloviy i ne proveriat v kajdom
        if(temperament > 19 && temperament != -1){

            temperamentTextView.setText(getText(R.string.temperament_19_or_more));
        }

        if(temperament > 15 && temperament <= 19 && temperament != -1){

            temperamentTextView.setText(getText(R.string.temperament_15_to_19));
        }

        if(temperament > 12 && temperament <= 15 && temperament != -1){

            temperamentTextView.setText(getText(R.string.temperament_12_to_15));
        }

        if(temperament == 12 && temperament != -1){

            temperamentTextView.setText(getText(R.string.temperament_12));
        }

        if(temperament < 12 && temperament >= 9 && temperament != -1){

            temperamentTextView.setText(getText(R.string.temperament_9_to_12));
        }

        if(temperament < 9 && temperament >= 5 && temperament != -1){

            temperamentTextView.setText(getText(R.string.temperament_5_to_9));
        }

        if(temperament < 5 && temperament != -1){

            temperamentTextView.setText(getText(R.string.temperament_5_or_less));
        }



        if(nervous > 19 && nervous != -1){

            nervousTextView.setText(getText(R.string.nervous_19_or_more));
        }

        if(nervous > 13 && nervous <= 19 && nervous != -1){

            nervousTextView.setText(getText(R.string.nervous_13_to_19));
        }

        if(nervous > 9 && nervous <= 13 && nervous != -1){

            nervousTextView.setText(getText(R.string.nervous_9_to_13_more));
        }

        if(nervous < 9 && nervous != -1){

            nervousTextView.setText(getText(R.string.nervous_9_or_less));
        }



        if(lie > 4 && lie != -1){

            lieTextView.setText(getText(R.string.lie_4_or_more));
        }

        if(lie <= 4 && lie != -1){

            lieTextView.setText(getText(R.string.lie_4_or_less));
        }
    }

    public void sort(){

        //tut nado pridumat sorting
    }
}
