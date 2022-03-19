package com.example.lightningmathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Leaderboard extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);
    }

    public void goHome(View view){
        button = (Button) findViewById(R.id.homeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuestion();
            }
        });
    }

    public void openQuestion() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}



