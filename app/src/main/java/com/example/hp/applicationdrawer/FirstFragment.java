package com.example.hp.applicationdrawer;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    RecyclerView recyclerView;
    EditText editTextSearch;
    ArrayList<String> names;
    Adapter1 adapter;
    View MyView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.first_layout, container, false);

        names = new ArrayList<>();
        names.add("Ramiz");
        names.add("Belal");
        names.add("Azad");
        names.add("Manish");
        names.add("Sunny");
        names.add("Shahid");
        names.add("Deepak");
        names.add("Deepika");
        names.add("Sumit");
        names.add("Mehtab");
        names.add("Vivek");


        recyclerView = (RecyclerView) MyView.findViewById(R.id.recyclerView);
        editTextSearch = (EditText) MyView.findViewById(R.id.editTextSearch);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new Adapter1(names);

        recyclerView.setAdapter(adapter);
        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //after the change calling the method and passing the search input
                filter(editable.toString());
            }
        });
       return  MyView;
    }

    private void filter(String text) {
        //new array list that will hold the filtered data
        ArrayList<String> filterdNames = new ArrayList<>();

        //looping through existing elements
        for (String s : names) {
            //if the existing elements contains the search input
            if (s.toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                filterdNames.add(s);
            }
        }

        //calling a method of the adapter class and passing the filtered list
        adapter.filterList(filterdNames);
    }



}