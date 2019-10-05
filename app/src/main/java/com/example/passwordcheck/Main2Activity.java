package com.example.passwordcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView usernameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usernameText=findViewById(R.id.UsernametextView);
        Intent intent=getIntent();
        String username=intent.getStringExtra("username");
        usernameText.setText(username);



    }
}
