package com.example.panchamkhaitan.temperatureconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ftoc(View v) {
        t = (TextView) findViewById(R.id.textView);
        t.setText("" + 5 * (Integer.parseInt(e1.getText().toString()) - 32) / 9);
    }

    public void ctof(View v) {
        t = (TextView) findViewById(R.id.textView);
        e1 = (EditText) findViewById(R.id.editText);
        t.setText("" + (9 * (Integer.parseInt(e1.getText().toString())) / 5 + 32));
    }
}