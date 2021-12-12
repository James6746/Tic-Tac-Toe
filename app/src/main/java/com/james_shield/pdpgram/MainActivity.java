package com.james_shield.pdpgram;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    PlayGround playGround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilaize();
        playGround.startPlaying();

    }

    public void initilaize() {
        playGround = new PlayGround();

        playGround.box1 = findViewById(R.id.box1);
        playGround.box2 = findViewById(R.id.box2);
        playGround.box3 = findViewById(R.id.box3);
        playGround.box4 = findViewById(R.id.box4);
        playGround.box5 = findViewById(R.id.box5);
        playGround.box6 = findViewById(R.id.box6);
        playGround.box7 = findViewById(R.id.box7);
        playGround.box8 = findViewById(R.id.box8);
        playGround.box9 = findViewById(R.id.box9);

        playGround.box1x = findViewById(R.id.box1_x);
        playGround.box2x = findViewById(R.id.box2_x);
        playGround.box3x = findViewById(R.id.box3_x);
        playGround.box4x = findViewById(R.id.box4_x);
        playGround.box5x = findViewById(R.id.box5_x);
        playGround.box6x = findViewById(R.id.box6_x);
        playGround.box7x = findViewById(R.id.box7_x);
        playGround.box8x = findViewById(R.id.box8_x);
        playGround.box9x = findViewById(R.id.box9_x);

        playGround.box1o = findViewById(R.id.box1_o);
        playGround.box2o = findViewById(R.id.box2_o);
        playGround.box3o = findViewById(R.id.box3_o);
        playGround.box4o = findViewById(R.id.box4_o);
        playGround.box5o = findViewById(R.id.box5_o);
        playGround.box6o = findViewById(R.id.box6_o);
        playGround.box7o = findViewById(R.id.box7_o);
        playGround.box8o = findViewById(R.id.box8_o);
        playGround.box9o = findViewById(R.id.box9_o);

        playGround.myTurn1 = findViewById(R.id.myTurn1);
        playGround.myTurn2 = findViewById(R.id.myTurn2);
        playGround.hisTurn1 = findViewById(R.id.hisTurn1);
        playGround.hisTurn2 = findViewById(R.id.hisTurn2);

        playGround.horizontal1 = findViewById(R.id.horizontal1);
        playGround.horizontal2 = findViewById(R.id.horizontal2);
        playGround.horizontal3 = findViewById(R.id.horizontal3);
        playGround.vertical1 = findViewById(R.id.vertical1);
        playGround.vertical2 = findViewById(R.id.vertical2);
        playGround.vertical3 = findViewById(R.id.vertical3);
        playGround.left_corner = findViewById(R.id.left_corner);
        playGround.right_corner = findViewById(R.id.right_corner);

        playGround.user_him = findViewById(R.id.user_him);
        playGround.user_me = findViewById(R.id.user_me);

        playGround.replay1 = findViewById(R.id.replay1);
        playGround.replay2 = findViewById(R.id.replay2);
    }
}

