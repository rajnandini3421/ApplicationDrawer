package com.example.hp.applicationdrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by HP on 04-05-2019.
 */

public class Holdings_Activity extends AppCompatActivity{

    RecyclerView recyclerView;
    ArrayList<String> items;
    Holdings_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.position_holding_layout);

        items = new ArrayList<>();
        items.add("Ramiz");
        items.add("Belal");
        items.add("Azad");
        items.add("Manish");
        items.add("Sunny");
        items.add("Shahid");
        items.add("Deepak");
        items.add("Deepika");
        items.add("Sumit");
        items.add("Mehtab");
        items.add("Vivek");


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_position_holding);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter = new Holdings_Adapter(items);

        recyclerView.setAdapter(adapter);
    }
}
