package com.entagesoft.ilia.cw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class greetingActivity extends AppCompatActivity {

    Button start;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        start = findViewById(R.id.button);

        switch(getIntent().getIntExtra("TestName", 0)) {

            case 0:

                textView.setText("error");
                break;

            case 1:

                textView.setText(getString(R.string.aizenka_greets));
                break;

            case 2:

                textView.setText(getString(R.string.profession_greets));
                break;

        }

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Test1Activity.class);
                startActivity(intent);
            }
        });
    }
}
