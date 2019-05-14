package com.example.hp.applicationdrawer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class Order_History_Adapter extends RecyclerView.Adapter<Order_History_Adapter.ViewHolder> {

    private ArrayList<String> items;

    public Order_History_Adapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_history_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txt_header.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_header;

        ViewHolder(View itemView) {
            super(itemView);

            txt_header = (TextView) itemView.findViewById(R.id.txt_header);
        }
    }

}