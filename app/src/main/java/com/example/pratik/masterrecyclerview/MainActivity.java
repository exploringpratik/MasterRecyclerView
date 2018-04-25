package com.example.pratik.masterrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
forFirst();

    }
    public void forFirst(){
        ArrayList<Items> places = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            places.add(new Items(R.drawable.done, "Topic " + i, "Info " + i));
             RecyclerView recyclerView = findViewById(R.id.recyclerView);

        MyAdapter adapter = new MyAdapter(places, this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);

        Button button = findViewById(R.id.button_seeAll);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RecyclerAfterActivity.class);
                startActivity(intent);
            }
        });
    }

    public void forSecond() {

    ArrayList<Items> places = new ArrayList<>();
for(
    int i = 0;i<100;i++)
        places.add(new Items(R.drawable.done, "Topic " + i, "Info " + i));

    RecyclerView recyclerView = findViewById(R.id.recyclerView);

    MyAdapter adapter = new MyAdapter(places, this);
            recyclerView.setAdapter(adapter);

    RecyclerView.LayoutManager mLayoutManager =
            new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(mLayoutManager);
}
}
