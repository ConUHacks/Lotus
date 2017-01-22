package com.example.archen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class addActivity extends AppCompatActivity {

    private Button add;
    private TextView mTextView;
    private TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        add = (Button) findViewById(R.id.button5);

        mTextView = (TextView) findViewById(R.id.textAdd);
        mTextView2 = (TextView) findViewById(R.id.textView5);

        mTextView.setText(" By clicking add. You will be able to place your desired food choice at a certain location.");
        mTextView2.setText(" Selecting view will enable you to observe other users food preferences.");

        add.setOnClickListener  (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
