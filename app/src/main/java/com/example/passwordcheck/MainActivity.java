package com.example.passwordcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText usernameEditText,passwordEditText;
    Button button;
    String goodPassword="1234";
    String goodUsername="Good";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText=findViewById(R.id.username);
        passwordEditText=findViewById(R.id.password);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable textusername = usernameEditText.getText();
                String username=textusername.toString();

                Editable textPassword = passwordEditText.getText();
                String password=textPassword.toString();

                System.out.println();
                if(goodUsername.equals(username)&&(goodPassword.equals(password)))
                {
                    Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("username",username);
                    startActivity(intent);


                }



            }
        });
    }
}
