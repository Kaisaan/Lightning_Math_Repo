package com.example.lightningmathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String difficulty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addButtonClicked(View view){
        System.out.println("Hello");
    }

    public void subtractButtonClicked(View view){

    }

    public void multiplyButtonClicked(View view){

    }

    public void divisionButtonClicked(View view){

    }

    public void difficultyButtonOnClick(View view){

        Button b = (Button)view;
        String bText = b.getText().toString();
        if (bText.equals("EASY")){
            String difficultly = "Easy";
        }
        else if (bText.equals("MEDIUM")){
            String difficulty = "Medium";

        }
        else if (bText.equals("HARD")){
            String difficulty = "Hard";

        }
        ((TextView) findViewById(R.id.difficultyLabel)).setText("Difficulty:" + difficulty);
    }

    public void MediumDifficulty(View view){
    }

    public void HardDifficulty(View view){
    }


}
