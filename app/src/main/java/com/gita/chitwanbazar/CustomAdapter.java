package com.gita.chitwanbazar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adv on 4/3/2017.
 */
public class CustomAdapter extends RecyclerView.Adapter {
    ArrayList<MyData> list1;

    public CustomAdapter(ArrayList<MyData> list) {
        this.list1=list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_design, parent, false);
        ViewHolder holder=new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ImageView image=(ImageView)holder.itemView.findViewById(R.id.image);
        TextView title = (TextView) holder.itemView.findViewById(R.id.name);
        TextView desc = (TextView) holder.itemView.findViewById(R.id.location);
       title.setText(list1.get(position).getName());
        desc.setText(list1.get(position).getPrice());
        image.setImageResource(list1.get(position).getImagep());


    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        View v;

        public ViewHolder(View item) {
            super(item);
            v=item;
        }
    }
}
