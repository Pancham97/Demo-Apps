package com.example.panchamkhaitan.nameofstudents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText editTxt, e2;
    private Button btn;
    private ListView list;
    private Button btn1;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxt = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        btn1 = (Button) findViewById(R.id.button2);
        list = (ListView) findViewById(R.id.listView);
        final List<String> lists = new ArrayList<String>();
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, lists);
        list.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lists.add(editTxt.getText().toString() + " " + e2.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lists.clear();
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}
