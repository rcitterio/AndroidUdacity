package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity /* implements View.OnClickListener */ {

    RelativeLayout nivel1;
    RelativeLayout nivel2;
    RelativeLayout nivel3;
    RelativeLayout nivel4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* nivel1 = (RelativeLayout) findViewById(R.id.relativeLayout);
        nivel2 = (RelativeLayout) findViewById(R.id.relativeLayout2);
        nivel3 = (RelativeLayout) findViewById(R.id.relativeLayout3);
        nivel4 = (RelativeLayout) findViewById(R.id.relativeLayout4);

        nivel1.setOnClickListener(this);
        nivel2.setOnClickListener(this);
        nivel3.setOnClickListener(this);
        nivel4.setOnClickListener(this);
        */
    }




    public void onClick1(View view) {
        Intent intent = new Intent(this,Nivel1.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(this,Nivel2.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
        Intent intent = new Intent(this,Nivel3.class);
        startActivity(intent);
    }
    public void onClick4(View view) {
        Intent intent = new Intent(this,Nivel4.class);
        startActivity(intent);
    }

    /*@Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.relativeLayout:
                intent = new Intent(this,Nivel1.class);
                break;
            case R.id.relativeLayout2:
                intent = new Intent(this, Nivel2.class);
                break;
            case R.id.relativeLayout3:
                intent = new Intent(this, Nivel3.class);
                break;
            case R.id.relativeLayout4:
                intent = new Intent(this, Nivel4.class);
                break;
        }
        startActivity(intent);
    }*/

}
