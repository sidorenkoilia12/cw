package com.entagesoft.ilia.cw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    int temperament, nervous, lie;
    TextView temperamentTextView, nervousTextView, lieTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        temperamentTextView = findViewById(R.id.temperament);
        nervousTextView = findViewById(R.id.nervous);
        lieTextView = findViewById(R.id.lie);

        Intent intent = getIntent();

        temperament = intent.getIntExtra("temperament", 0);
        nervous = intent.getIntExtra("nervous", 0);
        lie = intent.getIntExtra("lie", 0);

        if(temperament > 19){

            temperamentTextView.setText(getText(R.string.temperament_19_or_more));
        }

        if(temperament > 15 && temperament <= 19){

            temperamentTextView.setText(getText(R.string.temperament_15_to_19));
        }

        if(temperament > 12 && temperament <= 15){

            temperamentTextView.setText(getText(R.string.temperament_12_to_15));
        }

        if(temperament == 12){

            temperamentTextView.setText(getText(R.string.temperament_12));
        }

        if(temperament < 12 && temperament >= 9){

            temperamentTextView.setText(getText(R.string.temperament_9_to_12));
        }

        if(temperament < 9 && temperament >= 5){

            temperamentTextView.setText(getText(R.string.temperament_5_to_9));
        }

        if(temperament < 5 ){

            temperamentTextView.setText(getText(R.string.temperament_5_or_less));
        }



        if(nervous > 19){

            nervousTextView.setText(getText(R.string.nervous_19_or_more));
        }

        if(nervous > 13 && nervous <= 19){

            nervousTextView.setText(getText(R.string.nervous_13_to_19));
        }

        if(nervous > 9 && nervous <= 13){

            nervousTextView.setText(getText(R.string.nervous_9_to_13_more));
        }

        if(nervous < 9){

            nervousTextView.setText(getText(R.string.nervous_9_or_less));
        }



        if(lie > 4){

            lieTextView.setText(getText(R.string.lie_4_or_more));
        }

        if(lie <= 4){

            lieTextView.setText(getText(R.string.lie_4_or_less));
        }
    }
}
