package com.example.demo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demo.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt;
    EditText min;
    EditText max;
    Button nut;
    View.OnClickListener buttonFunction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.number);
        nut = findViewById(R.id.bt1);
        min = findViewById(R.id.min);
        max = findViewById(R.id.max);


        buttonFunction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Random random = new Random();
                    String a = min.getText().toString();
                    String b = max.getText().toString();
                    int so1=Integer.parseInt(a);
                    int so2=Integer.parseInt(b);
                    int so = random.nextInt(so2 - so1 + 1) + so1;
                    txt.setText(String.valueOf(String.valueOf(so)));

                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, R.string.warmning_text, Toast.LENGTH_SHORT).show();
                }
            }
        };


        nut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
        }
        try {
            Random random = new Random();
            String a = min.getText().toString();
            String b = max.getText().toString();
            int so1=Integer.parseInt(a);
            int so2=Integer.parseInt(b);
            int so = random.nextInt(so2 - so1 + 1) + so1;
            txt.setText(String.valueOf(String.valueOf(so)));

        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, R.string.warmning_text, Toast.LENGTH_SHORT).show();
        }
    }
}
