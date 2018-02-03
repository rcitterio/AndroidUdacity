package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity /* implements View.OnClickListener */ {

    RelativeLayout nivel1;
    RelativeLayout nivel2;
    RelativeLayout nivel3;
    RelativeLayout nivel4;
    boolean nvl2;
    boolean nvl3;
    boolean nvl4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nvl2 = false;
        nvl3 = false;
        nvl4 = false;
    }




    public void onClick1(View view) {
        Intent intent = new Intent(this,Nivel1.class);
        startActivityForResult(intent,1);

    }
    public void onClick2(View view) {
        if(!nvl2){
            if(Locale.getDefault().getLanguage() == "es") {
                Toast toast1 = Toast.makeText(getApplicationContext(), "ESTE NIVEL ESTÁ BLOQUEADO", Toast.LENGTH_SHORT);
                toast1.show();
            }else {
                Toast toast1 = Toast.makeText(getApplicationContext(), "THIS LEVEL IS UNLOCKED", Toast.LENGTH_SHORT);
                toast1.show();
            }
        }else {
            Intent intent = new Intent(this,Nivel2.class);
            startActivityForResult(intent,2);
        }
    }
    public void onClick3(View view) {
        if(!nvl3){
            if(Locale.getDefault().getLanguage() == "es") {
                Toast toast1 = Toast.makeText(getApplicationContext(), "ESTE NIVEL ESTÁ BLOQUEADO", Toast.LENGTH_SHORT);
                toast1.show();
            }else {
                Toast toast1 = Toast.makeText(getApplicationContext(), "THIS LEVEL IS UNLOCKED", Toast.LENGTH_SHORT);
                toast1.show();
            }
        }else {
            Intent intent = new Intent(this,Nivel3.class);
            startActivityForResult(intent,3);
        }
    }
    public void onClick4(View view) {
        if(!nvl4){
            if(Locale.getDefault().getLanguage() == "es") {
                Toast toast1 = Toast.makeText(getApplicationContext(), "ESTE NIVEL ESTÁ BLOQUEADO", Toast.LENGTH_SHORT);
                toast1.show();
            }else {
                Toast toast1 = Toast.makeText(getApplicationContext(), "THIS LEVEL IS UNLOCKED", Toast.LENGTH_SHORT);
                toast1.show();
            }
        }else{
            Intent intent = new Intent(this,Nivel4.class);
            startActivity(intent);
        }
    }

    public boolean isNvl2() {
        return nvl2;
    }

    public void setNvl2(boolean nvl2) {
        this.nvl2 = nvl2;
    }

    public boolean isNvl3() {
        return nvl3;
    }

    public void setNvl3(boolean nvl3) {
        this.nvl3 = nvl3;
    }

    public boolean isNvl4() {
        return nvl4;
    }

    public void setNvl4(boolean nvl4) {
        this.nvl4 = nvl4;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (resultCode == RESULT_OK && requestCode == 1) {
            this.setNvl2(true);
        }else if(resultCode == RESULT_OK && requestCode == 2){
            this.setNvl3(true);
        }else if(resultCode == RESULT_OK && requestCode == 3){
            this.setNvl4(true);
        }
    }
}
