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

public class MainActivity extends AppCompatActivity {
private EditText u,p;
private ImageButton i;
private TextView t;
private int count=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        u=(EditText)findViewById(R.id.editText2);
        p=(EditText)findViewById(R.id.editText3);
        t=(TextView)findViewById(R.id.textView3);
        i=(ImageButton)findViewById(R.id.imageButton);
        t.setText("Number of attemp Remaining : 3");
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(u.getText().toString(),p.getText().toString());
            }
        });

    }
    private void check(String username,String Password){
        if((username.isEmpty()&&(Password.isEmpty())))
        {
t.setText("FILL It !!!!");

        } else{
            if((username.equals("ajesh")) && (Password.equals("csit"))){
                Intent intent = new Intent(MainActivity.this,value.class);
                startActivity(intent);

            }else {
                count--;
                t.setText("Oops! Number of attempt Remaining:"+ String.valueOf(count));
                u.setText("");
                p.setText("");


                if(count==0){
                    i.setEnabled(false);

                }

            }
        }
    }
}
