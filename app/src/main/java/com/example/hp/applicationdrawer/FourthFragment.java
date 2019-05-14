package com.example.hp.applicationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP on 21-04-2019.
 */

public class FourthFragment extends Fragment {
    View MyView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.fourth_layout, container, false);
        return MyView;
    }
};