package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataClass> ramelist = new ArrayList<DataClass>();

    String tutorial[]= {"1",
            "2",
            "3",
            "4",
            "5",
            "6",
    };

   ListView listView;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.list);

        //ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,tutorial);
        //listView.setAdapter(arrayAdapter);

        ramelist.add(new DataClass(R.drawable.ic_launcher_background,"sabindra","shrestha"));
        ramelist.add(new DataClass(R.drawable.ic_launcher_background,"shrestha","nath"));

        MyAdapter adapter = new MyAdapter(MainActivity.this,ramelist);
        listView.setAdapter(adapter);


    }
}