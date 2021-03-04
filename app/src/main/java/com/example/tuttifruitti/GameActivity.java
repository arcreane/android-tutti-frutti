package com.example.tuttifruitti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1 [];
    int images [] = {R.drawable.bananes, R.drawable.citron, R.drawable.fraise, R.drawable.framboises,
            R.drawable.kiwi, R.drawable.orange, R.drawable.prune, R.drawable.raisins};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        recyclerView.findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.fruitsSelection);

        MyAdapter myAdapter = new MyAdapter(this, s1, images);




    }
}