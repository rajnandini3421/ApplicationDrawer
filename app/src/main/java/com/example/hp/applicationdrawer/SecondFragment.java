package com.example.hp.applicationdrawer;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HP on 21-04-2019.
 */

public class SecondFragment extends Fragment {
    View MyView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.second_layout, container, false);
        TextView textview=MyView.findViewById(R.id.textview);
        TextView textview1=MyView.findViewById(R.id.textview1);
        TextView login=MyView.findViewById(R.id.login);
        TextView sigup=MyView.findViewById(R.id.signup);

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getActivity(), Order_History_Activity.class);///Add each intent activity in Manifest
                startActivity(a);
            }

            });

        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(), Holdings_Activity.class);
                startActivity(a1);
            }

        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),ThirdFragment.class);
                startActivity(a1);
            }

        });


        return MyView;
    }
};