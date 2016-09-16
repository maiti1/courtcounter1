package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //call this method for TeamA score
    public void displayScore(View view)
    {
        score = score + 3;
        addScore(score);
    }
    public void display(View view)
    {
        score = score + 2;
        scoreAdd(score);
    }
    public void freeDisplay(View view)
    {
        score = score + 1;
        freeScore(score);
    }

    //call this methods for team2 scores
    public void teamDisplay(View view)
    {
        score1 = score1 + 3;
        teambAdd(score1);
    }
    public void taemBDisplay(View view)
    {
        score1 = score1 + 2;
        teamBAdd(score1);
    }
    public void teambBFree(View view)
    {
        score1 = score1 + 1;
        tmBFreeAdd(score1);
    }

    //call this method to reset the scores of the teams
    public void resetScores(View view)
    {
        resetMethod();
    }

    //this methods is for TeamA score
    public void addScore(int number)
    {
        TextView score = (TextView)findViewById(R.id.score_text_view);
        score.setText(""+number);
    }
    public void scoreAdd(int number)
    {
        TextView addscore = (TextView)findViewById(R.id.score_text_view);
        addscore.setText(""+number);
    }
    public void freeScore(int number)
    {
        TextView freescore = (TextView)findViewById(R.id.score_text_view);
        freescore.setText(""+number);
    }

    //this methods is for TeamB scores
    public void teambAdd(int number)
    {
        TextView orlndscore = (TextView)findViewById(R.id.score_text_view2);
        orlndscore.setText(""+number);
    }
    public void teamBAdd(int number)
    {
        TextView oscore = (TextView)findViewById(R.id.score_text_view2);
        oscore.setText(""+number);
    }
    public void tmBFreeAdd(int number)
    {
        TextView olndfree = (TextView)findViewById(R.id.score_text_view2);
        olndfree.setText(""+number);
    }

    //the method to reset the scores to initial value of 0
    public void resetMethod()
    {
        int teamAScore = 0;
        int teamBScore = 0;

        TextView rescore = (TextView)findViewById(R.id.score_text_view);
        rescore.setText(""+teamAScore);
        TextView rescoreo = (TextView)findViewById(R.id.score_text_view2);
        rescoreo.setText(""+teamBScore);
    }



}
