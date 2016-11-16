package com.example.user.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 09-11-2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] country_names,capital_names;

    public RecyclerAdapter(String[] country_names,String[] capital_names)
    {
        this.country_names=country_names;
        this.capital_names=capital_names;


    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

        RecyclerViewHolder recyclerViewHolder=  new RecyclerViewHolder(view);
        return recyclerViewHolder ;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tx_country.setText(country_names[position]);
        holder.tx_capital.setText(capital_names[position]);

    }


    @Override
    public int getItemCount() {
        return country_names.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView tx_country,tx_capital;
        public RecyclerViewHolder(View itemView) {
            super(itemView);

            tx_country=(TextView)itemView.findViewById(R.id.country);
            tx_capital=(TextView)itemView.findViewById(R.id.capital);

        }
    }
}
