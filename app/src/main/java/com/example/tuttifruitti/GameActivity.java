package com.example.tuttifruitti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class GameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getRandomFruit();

        Button validateChoiceButton = findViewById(R.id.validateChoiceButton);
        validateChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] userEntryChoice;


                // Selectionner le choix du spinner et le transformer en string pour l'ajouter au tableau userEntryChoice
                Spinner mySpinnerChoice1 = (Spinner) findViewById(R.id.spinnerChoice1);
                String spinnerChoice1 = mySpinnerChoice1.getSelectedItem().toString();

                Spinner mySpinnerChoice2 = (Spinner) findViewById(R.id.spinnerChoice2);
                String spinnerChoice2 = mySpinnerChoice2.getSelectedItem().toString();

                Spinner mySpinnerChoice3 = (Spinner) findViewById(R.id.spinnerChoice3);
                String spinnerChoice3 = mySpinnerChoice3.getSelectedItem().toString();

                Spinner mySpinnerChoice4 = (Spinner) findViewById(R.id.spinnerChoice4);
                String spinnerChoice4 = mySpinnerChoice4.getSelectedItem().toString();

                userEntryChoice = new String[] {spinnerChoice1, spinnerChoice2, spinnerChoice3, spinnerChoice4};


                //Set textView les choix du user sur le layout
                TextView choixUser1 = findViewById(R.id.printChoice1);
                choixUser1.setText(userEntryChoice[0]);

                TextView choixUser2 = findViewById(R.id.printChoice2);
                choixUser2.setText(userEntryChoice[1]);

                TextView choixUser3 = findViewById(R.id.printChoice3);
                choixUser3.setText(userEntryChoice[2]);

                TextView choixUser4 = findViewById(R.id.printChoice4);
                choixUser4.setText(userEntryChoice[3]);


            }
        });


        Button returnMenuButton = findViewById(R.id.menuReturnButton);
        returnMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Liaison avec l'activité MainActivity (menu principal)
                Intent intent = new Intent("com.example.tuttifruitti.MainActivity");
                startActivity(intent);
            }
        });

        Button changeDifficultyButton = findViewById(R.id.changeDifficultyButton);
        changeDifficultyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.tuttifruitti.Difficulty");
                startActivity(intent);
            }
        });






    }


      public void getRandomFruit() {
          String[] array = getResources().getStringArray(R.array.fruitsSelection);
          String randomFruit1 = array[new Random().nextInt(array.length)];
          String randomFruit2 = array[new Random().nextInt(array.length)];
          String randomFruit3 = array[new Random().nextInt(array.length)];
          String randomFruit4 = array[new Random().nextInt(array.length)];
          String[] arrayRandomFruit = {randomFruit1, randomFruit2, randomFruit3, randomFruit4};

        }


        // Méthode permettant de comparer l'entre utilisateur et le resultat au hasard de la machine
        public void resultComparaison() {


        if(){}

        else {}

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





