package com.example.lightningmathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String difficulty;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addButtonClicked(View view){
        button = (Button) findViewById(R.id.additionbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAnswer();
            }
        });
    }

    public void openAnswer() {
        Intent i = new Intent(this, Answer.class);
        startActivity(i);
    }

    public void subtractButtonClicked(View view){

    }

    public void multiplyButtonClicked(View view){

    }

    public void divisionButtonClicked(View view){

    }

    @SuppressLint("SetTextI18n")
    public void difficultyButtonOnClick(View view){

        Button b = (Button)view;
        String bText = b.getText().toString();
        switch (bText) {
            case "EASY":
                this.difficulty = "Easy";
                break;
            case "MEDIUM":
                this.difficulty = "Medium";
                break;
            case "HARD":
                this.difficulty = "Hard";
                break;
        }
        ((TextView) findViewById(R.id.difficultyLabel)).setText("Difficulty selected: " + difficulty);
           }

    public void MediumDifficulty(View view){
    }

    public void HardDifficulty(View view){
    }


}