package com.example.archen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InstructionActivity extends AppCompatActivity {

    private Button next;
    private TextView mTextView;
    private Instructions iObject = new Instructions();
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        next = (Button) findViewById(R.id.button3);
        mTextView = (TextView) findViewById(R.id.textView2);

        mTextView.setText("Don't you just hate it when ur favorite food place is far away? Don't you wish there was a way to find the food you want at a moment's notice?");
        next.setOnClickListener  (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instruction = iObject.getInstruction(counter);
                if(counter == iObject.getArrayLength()){
                    Intent intent = new Intent(InstructionActivity.this,addActivity.class);
                    startActivity(intent);
                } else {
                    mTextView.setText(instruction);
                }
                counter++;
                if(counter == 1){
                    next.setText("Start using urFood");
                }
            }
        });
    }
}
