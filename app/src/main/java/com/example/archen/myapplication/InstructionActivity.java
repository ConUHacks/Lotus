package com.example.archen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionActivity extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        next = (Button) findViewById(R.id.button3);

        next.setOnClickListener  (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InstructionActivity.this,addActivity.class);
                startActivity(intent);
            }
        });
    }
}
