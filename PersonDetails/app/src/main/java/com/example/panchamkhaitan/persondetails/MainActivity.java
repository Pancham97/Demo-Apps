package com.example.panchamkhaitan.persondetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.panchamkhaitan.persondetails.R;

public class MainActivity extends AppCompatActivity {
    public String gender = "male";
    public String hobbies = "";
    public String marriage = "";
    private Button regButton;
    private EditText username;
    private EditText userage;
    private RadioButton b1, b2;
    private CheckBox chksports, chkpaint, chkdance;
    private ToggleButton toggleButton1, toggleButton2;
    private TextView tv1, tv2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.reg_fullname);
        userage = (EditText) findViewById(R.id.reg_age);
        b1 = (RadioButton) findViewById(R.id.reg_male);
        b2 = (RadioButton) findViewById(R.id.reg_female);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        chksports = (CheckBox) findViewById(R.id.chksports);
        chkpaint = (CheckBox) findViewById(R.id.chkpainting);
        chkdance = (CheckBox) findViewById(R.id.chkdance);
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender = "male";
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender = "female";
            }
        });
        regButton = (Button) findViewById(R.id.btnRegister);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("");
                if (chksports.isChecked()) {
                    result.append("Sports ");
                }
                if (chkpaint.isChecked()) {
                    result.append("Painting ");
                }
                if (chkdance.isChecked()) {
                    result.append("Dancing ");
                }
                hobbies = result.toString();
                StringBuffer result2 = new StringBuffer();
                result2.append("").append(toggleButton1.getText());
                marriage = result2.toString();
                Intent i = new Intent(getApplicationContext(), Activity2.class);
                i.putExtra("name", username.getText().toString());
                i.putExtra("age", userage.getText().toString());
                i.putExtra("gender", gender);
                i.putExtra("hobbies", hobbies);
                i.putExtra("marriage", marriage);
                startActivity(i);
            }
        });
    }
}