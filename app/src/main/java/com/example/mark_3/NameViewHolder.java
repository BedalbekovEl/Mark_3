package com.example.mark_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.name_1);
    }
    public void onBind(NameList group){

    }
}
