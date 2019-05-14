package com.example.hp.applicationdrawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 04-05-2019.
 */

class Holdings_Adapter extends RecyclerView.Adapter<Holdings_Adapter.ViewHolder> {

    private ArrayList<String> items;

    public Holdings_Adapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public Holdings_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.position_holding_list_item, parent, false);
        return new Holdings_Adapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Holdings_Adapter.ViewHolder holder, int position) {
        holder.txt_holding.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_holding;

        ViewHolder(View itemView) {
            super(itemView);

            txt_holding = (TextView) itemView.findViewById(R.id.txt_holding);
        }
    }

}