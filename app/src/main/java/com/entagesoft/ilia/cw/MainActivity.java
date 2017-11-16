package com.entagesoft.ilia.cw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_aizenka, button_profession;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_aizenka = findViewById(R.id.button_aizenka);
        button_profession = findViewById(R.id.button_profession);

        button_aizenka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), greetingActivity.class);
                intent.putExtra("TestName", 1);
                startActivity(intent);
            }
        });

        button_profession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), greetingActivity.class);
                intent.putExtra("TastName", 2);
                startActivity(intent);
            }
        });


    }
}
