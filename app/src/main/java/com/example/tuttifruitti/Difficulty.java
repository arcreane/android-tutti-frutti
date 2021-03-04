package com.example.tuttifruitti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;


public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);


        // Le clic sur le bouton Play permet de lancer la GameActivity
        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_game);

                Intent intent = new Intent(Difficulty.this, GameActivity.class);
                startActivity(intent);
            }
        });


        // Le clic sur le bouton Return permet de lancer la MainActivity
        Button returnButton = findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);

                Intent intent = new Intent(Difficulty.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}