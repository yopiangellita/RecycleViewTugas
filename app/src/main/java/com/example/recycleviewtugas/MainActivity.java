package com.example.recycleviewtugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Buah>arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Buah(R.drawable.alpukat,"Alpukat"));
        arrayList.add(new Buah(R.drawable.jambubiji,"Jambu biji"));
        arrayList.add(new Buah(R.drawable.apel,"Apel"));
        arrayList.add(new Buah(R.drawable.pepaya,"Pepaya"));
        arrayList.add(new Buah(R.drawable.rambutan,"Rambutan"));

        BuahRecylerView buahRecylerView=new BuahRecylerView(this,arrayList);
        recyclerView.setAdapter(buahRecylerView);
    }
}