package com.example.ajesh.multiplicationtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class answer extends AppCompatActivity {
private TextView aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Bundle extras = getIntent().getExtras();
        String stringVariableName = extras.getString("StringVariableName");
        int intVariableName = Integer.parseInt(stringVariableName);
        aa= (TextView)findViewById(R.id.textView5);

        aa.setText("Oops! Number of attempt Remaining:"+ String.valueOf(intVariableName));
    }
}
