package com.example.tictactoe_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);
    }

    public void playAgainButtonClick(View v){

    }

    public void homeButtonClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}