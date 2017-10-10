package com.example.panchamkhaitan.practical6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView usernameView, passwordView;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameView = (TextView) findViewById(R.id.editText);
        passwordView = (TextView) findViewById(R.id.editText2);

        loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usernameView.getText().toString().equals("admin") && passwordView.getText().toString().equals("admin")) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Username or password incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
