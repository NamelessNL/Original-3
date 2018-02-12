package com.example.s1.myapplicationh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button buttonsignup2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonsignup2 =(Button) findViewById(R.id.button);
        buttonsignup2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSignUp();
            }
        });

    }

    public void openSignUp(){
        Intent intent = new Intent(this, SignUpq.class);
        startActivity(intent);
    }
}
