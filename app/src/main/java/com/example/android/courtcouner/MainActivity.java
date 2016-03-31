package com.example.android.courtcouner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int A = 0;
    int B = 0;
    public void AddThreeForA(View view){
        A = A+3;
        displayForTeamA(A);
    }
    public void AddTwoForA(View view){
        A = A+2;
        displayForTeamA(A);
    }
    public void AddOneForA(View view){
        A = A+1;
        displayForTeamA(A);
    }

    public void AddThreeForB(View view){
        B = B+3;
        displayForTeamB(B);
    }
    public void AddTwoForB(View view){
        B = B+3;
        displayForTeamB(B);
    }
    public void AddOneForB(View view){
        B = B+3;
        displayForTeamB(B);
    }
    public void reset(View view) {
        A = 0;
        B = 0;
        displayForTeamA(A);
        displayForTeamB(B);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
