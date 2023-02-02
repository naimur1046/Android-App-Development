



package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {
    EditText edUsername,edPassword;
    Button login;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUsername=findViewById(R.id.userName);
        edPassword=findViewById(R.id.Password);
        login=findViewById(R.id.button1);
        register=findViewById(R.id.bolttom);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edUsername.getText().toString();
                String password=edPassword.getText().toString();
                if(name.length()==0||password.length()==0)
                {
                    register.setText("Please enter login info");
                }
            }
        });
    }
}
