package com.example.tuttifruitti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final Button startButton= findViewById(R.id.bt_start);

    public void startGame(View view) {
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_difficulty);
            }
        });

    }

    public void showScores(View view) {
    }

    public void quitGame(View view) {
    }
}