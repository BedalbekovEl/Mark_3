package com.example.mark_3;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    ArrayList<NameList> group = new ArrayList<NameList>();

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.name_list, parent, false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.onBind(group.get(position));

    }

    @Override
    public int getItemCount() {
        return group.size();
    }

    public void addText(ArrayList<NameList> list){
        group = list;
        notifyDataSetChanged();
    }
}
