package com.example.tuttifruitti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Liaison avec l'activité GameActivity
                Intent intent = new Intent("com.example.tuttifruitti.GameActivity");
                startActivity(intent);
            }
        });


        Button returnButton = findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Liaison avec l'activité MainActivity (menu principal)
                Intent intent = new Intent("com.example.tuttifruitti.MainActivity");
                startActivity(intent);
            }
        });


    }
}