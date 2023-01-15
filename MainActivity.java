package com.example.lovet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv_background = findViewById(R.id.backgroungImage);
        AnimationDrawable animationDrawable = (AnimationDrawable) iv_background.getDrawable();
        animationDrawable.start();


        Button btnclick1 = findViewById(R.id.ReadButton1);
        Button btnclick2 = findViewById(R.id.ReadButton2);
        Button calbutton = findViewById(R.id.calbutton);
        Button reviewsbutton = findViewById(R.id.reviewsbutton);

        btnclick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("நன்று!");
                builder.setPositiveButton("தொடரலாம்!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();



                }

        });
        btnclick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("போய் படி !");
                builder.setPositiveButton("தொடரலாம்!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();



            }



        });


        calbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivityR();
            }
        });

        reviewsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivityC();
            }
        });






        }



    private void openNewActivityR() {
        Intent intent1 = new Intent(this,Calender.class);
        startActivity(intent1);
    }

    private void openNewActivityC() {
        Intent  intent2 = new Intent(this, addReview.class);
        startActivity(intent2);
    }


}



