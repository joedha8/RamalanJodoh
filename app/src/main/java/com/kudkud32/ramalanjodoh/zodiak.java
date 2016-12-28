package com.kudkud32.ramalanjodoh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kudkud32.ramalanjodoh.adapter.RecyclerViewAdapter;

public class zodiak extends AppCompatActivity {
    RecyclerView rview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiak);

        rview = (RecyclerView)findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this);
        rview.setAdapter(adapter);
        rview.setHasFixedSize(true);
        rview.setLayoutManager( new LinearLayoutManager(this));


    }
}
