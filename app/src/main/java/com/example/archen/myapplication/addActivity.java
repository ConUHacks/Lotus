package com.example.archen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addActivity extends AppCompatActivity {

    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        add = (Button) findViewById(R.id.button5);

        add.setOnClickListener  (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
