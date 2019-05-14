package com.example.hp.applicationdrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by HP on 04-05-2019.
 */

public class Order_History_Activity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<String> items;
    Order_History_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_historylayout);

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


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_order_history);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter = new Order_History_Adapter(items);

        recyclerView.setAdapter(adapter);
    }
}