package com.example.panchamkhaitan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v) {
        t = (TextView) findViewById(R.id.textView);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        t.setText("Add:" + (Integer.parseInt(e1.getText().toString())
                + Integer.parseInt(e2.getText().toString())));
    }

    public void mul(View v) {
        t = (TextView) findViewById(R.id.textView);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        t.setText("Multiply:" + (Integer.parseInt(e1.getText().toString()) * Integer.parseInt(e2.getText().toString())))
        ;
    }

    public void div(View v) {
        t = (TextView) findViewById(R.id.textView);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        t.setText("Divide:" + (Integer.parseInt(e1.getText().toString()) / Integer.parseInt(e2.getText().toString())));
    }

    public void sub(View v) {
        t = (TextView) findViewById(R.id.textView);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        t.setText("subtract:" + (Integer.parseInt(e1.getText().toString()) -
                Integer.parseInt(e2.getText().toString())));
    }
}