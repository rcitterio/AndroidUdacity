package com.example.android.quizapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class Nivel3 extends AppCompatActivity {

    boolean norway;
    boolean mali;
    boolean cuba;
    SoundPool sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel3);
        norway = false;
        cuba = false;
        mali = false;
        sp = new SoundPool(3, AudioManager.STREAM_MUSIC,0);
    }

    public void onClickNorway(View view){
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.correct);
        mPlayer.start();
        norway = true;
        comprobarSolucion();
    }
    public void onClickCorea(View view){
        if(Locale.getDefault().getLanguage() == "es") {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fallastes! Comienza de nuevo", Toast.LENGTH_SHORT);
            toast1.show();
        }else {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Start Again", Toast.LENGTH_SHORT);
            toast1.show();
        }
        allFalse();
    }
    public void onClickPakis(View view){
        if(Locale.getDefault().getLanguage() == "es") {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fallastes! Comienza de nuevo", Toast.LENGTH_SHORT);
            toast1.show();
        }else {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Start Again", Toast.LENGTH_SHORT);
            toast1.show();
        }
        allFalse();
    }
    public void onClickMali(View view){
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.correct);
        mPlayer.start();
        mali = true;
        comprobarSolucion();
    }
    public void onClickCuba(View view){
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.correct);
        mPlayer.start();
        cuba = true;
        comprobarSolucion();
    }
    public void onClickPRico(View view){
        if(Locale.getDefault().getLanguage() == "es") {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fallastes! Comienza de nuevo", Toast.LENGTH_SHORT);
            toast1.show();
        }else {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Start Again", Toast.LENGTH_SHORT);
            toast1.show();
        }
        allFalse();
    }

    private void comprobarSolucion(){
        if( norway && mali && cuba){
            allFalse();
            setResult(RESULT_OK);
            finish();
            if(Locale.getDefault().getLanguage() == "es") {
                Toast toast1 = Toast.makeText(getApplicationContext(), "ENHORABUENA!! NIVEL 3 COMPLETADO", Toast.LENGTH_SHORT);
                toast1.show();
            }else {
                Toast toast1 = Toast.makeText(getApplicationContext(), "CONGRATULATIONS!! LEVEL 3 PASSED", Toast.LENGTH_SHORT);
                toast1.show();
            }
        }
    }

    private void allFalse(){
        norway = false;
        mali = false;
        cuba = false;
    }
}
