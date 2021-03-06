package com.example.lightningmathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Answer extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_screen);
    }

    public void submitAnswer(View view){
        button = (Button) findViewById(R.id.submitButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuestion();
            }
        });
    }

    public void openQuestion() {
        Intent i = new Intent(this, Leaderboard.class);
        startActivity(i);
    }

}



