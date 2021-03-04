package com.example.tuttifruitti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getRandomFruit();

    }


      public void getRandomFruit() {
          String[] array = getResources().getStringArray(R.array.fruitsSelection);
          String randomFruit1 = array[new Random().nextInt(array.length)];
          String randomFruit2 = array[new Random().nextInt(array.length)];
          String randomFruit3 = array[new Random().nextInt(array.length)];
          String randomFruit4 = array[new Random().nextInt(array.length)];
          String[] arrayRandomFruit = { randomFruit1, randomFruit2, randomFruit3, randomFruit4 };
          
        }


}

//RecyclerView recyclerView;

// String s1 [];
// int images [] = {R.drawable.bananes, R.drawable.citron, R.drawable.fraise, R.drawable.framboises,
// R.drawable.kiwi, R.drawable.orange, R.drawable.prune, R.drawable.raisins};
// @Override
// protected void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// setContentView(R.layout.activity_game2);
// recyclerView.findViewById(R.id.recyclerView);
// s1 = getResources().getStringArray(R.array.fruitsSelection);
// MyAdapter myAdapter = new MyAdapter(this, s1, images);





