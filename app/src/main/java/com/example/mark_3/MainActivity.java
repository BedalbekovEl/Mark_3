package com.example.mark_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    NameAdapter adapter;
    ArrayList<NameList> list;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new NameAdapter();

        recycler.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        list = new ArrayList<>();
        list.add(0,new NameList("Nursultan"));
        list.add(1,new NameList("Bekjhan"));
        list.add(2,new NameList("Aknazar"));
        list.add(3,new NameList("Narine"));
        list.add(4,new NameList("Nuraiym"));
        list.add(5,new NameList("Asel"));
        list.add(6,new NameList("Aiperi"));
        list.add(7,new NameList("Kanykei"));
        list.add(8,new NameList("Anuar"));
        list.add(9,new NameList("Emir"));
        list.add(10,new NameList("Islamidin"));
        list.add(11,new NameList("Beknazar"));
        list.add(12,new NameList("Omar"));
        list.add(13,new NameList("Elaman"));


        adapter.addText(list);
    }
}