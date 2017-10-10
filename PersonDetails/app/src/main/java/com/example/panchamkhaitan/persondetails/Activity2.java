package com.example.panchamkhaitan.persondetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.panchamkhaitan.persondetails.R;

public class Activity2 extends AppCompatActivity {
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);
        tv10 = (TextView) findViewById(R.id.tv10);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String age = i.getStringExtra("age");
        String gender = i.getStringExtra("gender");
        String hobbies = i.getStringExtra("hobbies");
        String marriage = i.getStringExtra("marriage");
        tv2.setText(name);
        tv4.setText(age);
        tv6.setText(gender);
        tv8.setText(hobbies);
        tv10.setText(marriage);
    }
}