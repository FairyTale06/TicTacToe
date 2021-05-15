package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    int count = 1;
    ImageView mbox1, mbox2, mbox3, mbox4, mbox5, mbox6, mbox7, mbox8, mbox9;
    int b1=10,b2=20,b3=30,b4=40,b5=50,b6=60,b7=70,b8=80,b9=90;
    ImageView mtextturn;

    android.widget.Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbox1 = findViewById(R.id.img1);
        mbox2 = findViewById(R.id.img2);
        mbox3 = findViewById(R.id.img3);
        mbox4 = findViewById(R.id.img4);
        mbox5 = findViewById(R.id.img5);
        mbox6 = findViewById(R.id.img6);
        mbox7 = findViewById(R.id.img7);
        mbox8 = findViewById(R.id.img8);
        mbox9 = findViewById(R.id.img9);
        mtextturn = findViewById(R.id.turn);
        btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbox1.setImageResource(R.drawable.img);
                mbox2.setImageResource(R.drawable.img);
                mbox3.setImageResource(R.drawable.img);
                mbox4.setImageResource(R.drawable.img);
                mbox5.setImageResource(R.drawable.img);
                mbox6.setImageResource(R.drawable.img);
                mbox7.setImageResource(R.drawable.img);
                mbox8.setImageResource(R.drawable.img);
                mbox9.setImageResource(R.drawable.img);

                b1=10;b2=20;b3=30;b4=40;b5=50;b6=60;b7=70;b8=80;b9=90;

                count = 1;
            }
        });

        mbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox1.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b1 = 1;
                }
                else{
                    mbox1.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b1 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox2.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b2 = 1;
                }
                else{
                    mbox2.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b2 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox3.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b3 = 1;
                }
                else{
                    mbox3.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b3 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox4.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b4 = 1;
                }
                else{
                    mbox4.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b4 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox5.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b5 = 1;
                }
                else{
                    mbox5.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b5 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox6.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b6 = 1;
                }
                else{
                    mbox6.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b6 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox7.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b7 = 1;
                }
                else{
                    mbox7.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b7 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox8.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b8 = 1;
                }
                else{
                    mbox8.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b8 = 2;
                }
                count += 1;
                checkWin();
            }
        });
        mbox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){
                    mbox9.setImageResource(R.drawable.circle);
                    mtextturn.setImageResource(R.drawable.cross);
                    b9 = 1;
                }
                else{
                    mbox9.setImageResource(R.drawable.cross);
                    mtextturn.setImageResource(R.drawable.circle);
                    b9 = 2;
                }
                count += 1;
                checkWin();
            }
        });

    }

    void checkWin(){

        if((b1==b2&&b1==b3) || (b4==b5&&b4==b6) || (b7==b8&&b7==b9)){
            if((b1==1&&b2==1&&b3==1) || (b4==1&&b5==1&&b6==1) || (b7==1&&b8==1&&b9==1)){
                //circle win
                openDialog(count);
            }
            else if((b1==2&&b2==2&&b3==2) || (b4==2&&b5==2&&b6==2) || (b7==2&&b8==2&&b9==2)){
                //cross win
                openDialog(count);
            }
        }
        else if((b1==b5&&b1==b9) || (b3==b5&&b3==b7)){
            if((b1==1&&b5==1&&b9==1)||(b3==1&&b5==1&&b7==1)){
                //circle win
                openDialog(count);
            }else if((b1==2&&b5==2&&b9==2)||(b3==2&&b5==2&&b7==2)){
                //cross win
                openDialog(count);
            }
        }
        else if((b1==b4&&b1==b7) || (b2==b5&&b2==b8) || (b3==b6&&b3==b9)){
            if((b1==1&&b4==1&&b7==1) || (b2==1&&b5==1&&b8==1) || (b3==1&&b6==1&&b9==1)){
                //circle win
                openDialog(count);
            }else if((b1==2&&b4==2&&b7==2) || (b2==2&&b5==2&&b8==2) || (b3==2&&b6==2&&b9==2)){
                //cross win
                openDialog(count);
            }
        }
    }

    public void openDialog(int count){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("We Have A Winner");
        if(count%2==0){
            alertDialog.setMessage("Cross Player Win!");
        }
        else if(count%2!=0){
            alertDialog.setMessage("Circle Player Win!");
        }
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
        mbox1.setImageResource(R.drawable.img);
        mbox2.setImageResource(R.drawable.img);
        mbox3.setImageResource(R.drawable.img);
        mbox4.setImageResource(R.drawable.img);
        mbox5.setImageResource(R.drawable.img);
        mbox6.setImageResource(R.drawable.img);
        mbox7.setImageResource(R.drawable.img);
        mbox8.setImageResource(R.drawable.img);
        mbox9.setImageResource(R.drawable.img);

        b1=10;b2=20;b3=30;b4=40;b5=50;b6=60;b7=70;b8=80;b9=90;

        count = 1;
    }
}