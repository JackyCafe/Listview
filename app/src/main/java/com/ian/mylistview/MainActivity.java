package com.ian.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    List<String> datas ;
    ListAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listview);
        datas = new ArrayList<>();
        datas.add("Apple");
        datas.add("Banana");
        datas.add("Orangle");
        adapter = new ListAdapter(this,datas);
        lv.setAdapter(adapter);


    }
}