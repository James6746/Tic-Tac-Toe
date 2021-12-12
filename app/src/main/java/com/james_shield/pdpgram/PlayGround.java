package com.james_shield.pdpgram;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PlayGround extends AppCompatActivity {

    public boolean myTurn = true;
    public boolean hisTurn = false;
    public CardView box1;
    public CardView box2;
    public CardView box3;
    public CardView box4;
    public CardView box5;
    public CardView box6;
    public CardView box7;
    public CardView box8;
    public CardView box9;
    public ImageView box1x;
    public ImageView box2x;
    public ImageView box3x;
    public ImageView box4x;
    public ImageView box5x;
    public ImageView box6x;
    public ImageView box7x;
    public ImageView box8x;
    public ImageView box9x;
    public ImageView box1o;
    public ImageView box2o;
    public ImageView box3o;
    public ImageView box4o;
    public ImageView box5o;
    public ImageView box6o;
    public ImageView box7o;
    public ImageView box8o;
    public ImageView box9o;
    public ImageView myTurn1;
    public ImageView myTurn2;
    public ImageView hisTurn1;
    public ImageView hisTurn2;

    public ImageView horizontal1;
    public ImageView horizontal2;
    public ImageView horizontal3;
    public ImageView vertical1;
    public ImageView vertical2;
    public ImageView vertical3;
    public ImageView right_corner;
    public ImageView left_corner;

    public ImageView user_him;
    public ImageView user_me;

    public ImageButton replay1;
    public ImageButton replay2;

    private int[] check = new int[9];

    public void startPlaying(){
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box1x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box1.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[0] = 1;
                } else {
                    box1o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box1.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[0] = 2;
                }

                checkFinished();
            }
        });

        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box2x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box2.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[1] = 1;
                } else {
                    box2o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box2.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[1] = 2;
                }

                checkFinished();
            }
        });

        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box3x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box3.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[2] = 1;
                } else {
                    box3o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box3.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[2] = 2;
                }

                checkFinished();
            }
        });

        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box4x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box4.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[3] = 1;
                } else {
                    box4o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box4.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[3] = 2;
                }

                checkFinished();
            }
        });

        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box5x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box5.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[4] = 1;
                } else {
                    box5o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box5.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[4] = 2;
                }

                checkFinished();
            }
        });

        box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box6x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box6.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[5] = 1;
                } else {
                    box6o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box6.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[5] = 2;
                }

                checkFinished();
            }
        });

        box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box7x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box7.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[6] = 1;
                } else {
                    box7o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box7.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[6] = 2;
                }

                checkFinished();
            }
        });

        box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box8x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box8.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[7] = 1;
                } else {
                    box8o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box8.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[7] = 2;
                }

                checkFinished();
            }
        });

        box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myTurn){
                    box9x.setVisibility(View.VISIBLE);
                    myTurn = false;
                    hisTurn = true;
                    box9.setClickable(false);
                    myTurn1.setVisibility(View.INVISIBLE);
                    myTurn2.setVisibility(View.INVISIBLE);
                    hisTurn1.setVisibility(View.VISIBLE);
                    hisTurn2.setVisibility(View.VISIBLE);
                    check[8] = 1;
                } else {
                    box9o.setVisibility(View.VISIBLE);
                    hisTurn = false;
                    myTurn = true;
                    box9.setClickable(false);
                    myTurn1.setVisibility(View.VISIBLE);
                    myTurn2.setVisibility(View.VISIBLE);
                    hisTurn1.setVisibility(View.INVISIBLE);
                    hisTurn2.setVisibility(View.INVISIBLE);
                    check[8] = 2;
                }

                checkFinished();
            }
        });

        replay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replay();
            }
        });

        replay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replay();
            }
        });
    }

    private void checkFinished(){
        if(check[0] == 1 && check[1] == 1 && check[2] == 1){
            horizontal1.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[3] == 1 && check[4] == 1 && check[5] == 1){
            horizontal2.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[6] == 1 && check[7] == 1 && check[8] == 1){
            horizontal3.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[0] == 1 && check[3] == 1 && check[6] == 1){
            vertical1.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[1] == 1 && check[4] == 1 && check[7] == 1){
            vertical2.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[2] == 1 && check[5] == 1 && check[8] == 1){
            vertical3.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[0] == 1 && check[4] == 1 && check[8] == 1){
            left_corner.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[2] == 1 && check[4] == 1 && check[6] == 1){
            right_corner.setVisibility(View.VISIBLE);
            user_me.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        //===========================for o ===========================

        if(check[0] == 2 && check[1] == 2 && check[2] == 2){
            horizontal1.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[3] == 2 && check[4] == 2 && check[5] == 2){
            horizontal2.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[6] == 2 && check[7] == 2 && check[8] == 2){
            horizontal3.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[0] == 2 && check[3] == 2 && check[6] == 2){
            vertical1.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[1] == 2 && check[4] == 2 && check[7] == 2){
            vertical2.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[2] == 2 && check[5] == 2 && check[8] == 2){
            vertical3.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[0] == 2 && check[4] == 2 && check[8] == 2){
            left_corner.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }
        if(check[2] == 2 && check[4] == 2 && check[6] == 2){
            right_corner.setVisibility(View.VISIBLE);
            user_him.setVisibility(View.VISIBLE);
            makeDisabled();
        }


    }

    private void makeDisabled(){
        box1.setClickable(false);
        box2.setClickable(false);
        box3.setClickable(false);
        box4.setClickable(false);
        box5.setClickable(false);
        box6.setClickable(false);
        box7.setClickable(false);
        box8.setClickable(false);
        box9.setClickable(false);
    }

    private void replay(){
        box1.setClickable(true);
        box2.setClickable(true);
        box3.setClickable(true);
        box4.setClickable(true);
        box5.setClickable(true);
        box6.setClickable(true);
        box7.setClickable(true);
        box8.setClickable(true);
        box9.setClickable(true);

        user_him.setVisibility(View.INVISIBLE);
        user_me.setVisibility(View.INVISIBLE);

        horizontal1.setVisibility(View.INVISIBLE);
        horizontal2.setVisibility(View.INVISIBLE);
        horizontal3.setVisibility(View.INVISIBLE);
        vertical1.setVisibility(View.INVISIBLE);
        vertical2.setVisibility(View.INVISIBLE);
        vertical3.setVisibility(View.INVISIBLE);
        left_corner.setVisibility(View.INVISIBLE);
        right_corner.setVisibility(View.INVISIBLE);

        myTurn1.setVisibility(View.VISIBLE);
        myTurn2.setVisibility(View.VISIBLE);
        hisTurn1.setVisibility(View.INVISIBLE);
        hisTurn2.setVisibility(View.INVISIBLE);

        box1x.setVisibility(View.INVISIBLE);
        box2x.setVisibility(View.INVISIBLE);
        box3x.setVisibility(View.INVISIBLE);
        box4x.setVisibility(View.INVISIBLE);
        box5x.setVisibility(View.INVISIBLE);
        box6x.setVisibility(View.INVISIBLE);
        box7x.setVisibility(View.INVISIBLE);
        box8x.setVisibility(View.INVISIBLE);
        box9x.setVisibility(View.INVISIBLE);

        box1o.setVisibility(View.INVISIBLE);
        box2o.setVisibility(View.INVISIBLE);
        box3o.setVisibility(View.INVISIBLE);
        box4o.setVisibility(View.INVISIBLE);
        box5o.setVisibility(View.INVISIBLE);
        box6o.setVisibility(View.INVISIBLE);
        box7o.setVisibility(View.INVISIBLE);
        box8o.setVisibility(View.INVISIBLE);
        box9o.setVisibility(View.INVISIBLE);

        myTurn = true;
        hisTurn = false;

        for(int i = 0; i < check.length; i++){
            check[i] = 0;
        }
    }
}
