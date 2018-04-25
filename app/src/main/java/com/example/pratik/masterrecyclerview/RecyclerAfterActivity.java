package com.example.pratik.masterrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.util.Log;

import java.util.ArrayList;

public class RecyclerAfterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_after);

        ArrayList<Items> places = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            places.add(new Items(R.drawable.done, "Topic " + i, "Info " + i));
        RecyclerView recyclerView = findViewById(R.id.recyclerViewAfter);

        MyAdapter adapter = new MyAdapter(places, this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);

        Explode explode = new Explode();
        getWindow().setExitTransition(explode);
            }
}
