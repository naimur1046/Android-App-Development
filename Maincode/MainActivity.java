package com.example.myapplication;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview=findViewById(R.id.textView);
        edittext=findViewById(R.id.edittext);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edittext.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.2046*kg;
                textview.setText("The corrosponding pound is "+pound);

            }
        });

    }
}
