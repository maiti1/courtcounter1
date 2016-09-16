package com.example.admin.courtcounter;

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

    //call this method for kaizer score
    public void displayScore(View view)
    {
        addScore(3);
    }
    public void display(View view)
    {
        scoreAdd(2);
    }
    public void freeDisplay(View view)
    {
        freeScore(1);
    }

    //call this methods for orlando scores
    public void orlandoDisplay(View view)
    {
        orlandoAdd(3);
    }
    public void orlndDisplay(View view)
    {
        orlndAdd(2);
    }
    public void orlandoFree(View view)
    {
        orlndFreeAdd(1);
    }

    //this methods is for kaizer score
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

    //this methods is for orlando scores
    public void orlandoAdd(int number)
    {
        TextView orlndscore = (TextView)findViewById(R.id.score_text_view2);
        orlndscore.setText(""+number);
    }
    public void orlndAdd(int number)
    {
        TextView oscore = (TextView)findViewById(R.id.score_text_view2);
        oscore.setText(""+number);
    }
    public void orlndFreeAdd(int number)
    {
        TextView olndfree = (TextView)findViewById(R.id.score_text_view2);
        olndfree.setText(""+number);
    }



}
