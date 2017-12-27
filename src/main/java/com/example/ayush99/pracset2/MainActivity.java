package com.example.ayush99.pracset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score1=0, score2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3(View view){
        score1 = score1 + 3;
        displayForTeamA(score1);
    }
    public void plus2(View view){
        score1 = score1 +2;
        displayForTeamA(score1);
    }
    public void free1(View view){
        score1 = score1 +1;
        displayForTeamA(score1);
    }
}