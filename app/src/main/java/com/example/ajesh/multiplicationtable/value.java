package com.example.ajesh.multiplicationtable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class value extends AppCompatActivity {
    private EditText enter;
    private ImageButton submit;
    private TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_value);
        getSupportActionBar().hide();
        enter = (EditText) findViewById(R.id.editText);


        submit = (ImageButton) findViewById(R.id.imageButton2);
        tt = (TextView) findViewById(R.id.textView7);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                pass(enter.getText().toString());

            }
        });

    }

    public void pass(String i) {
        //Intent intents = new Intent(value.this, answer.class);
        //Bundle extras = new Bundle();
        //extras.putString("StringVariableName", enter + "");
        //intents.putExtras(extras);
        //startActivity(intents);
        enter.setText("");
        int number = Integer.parseInt(i);
    }
}