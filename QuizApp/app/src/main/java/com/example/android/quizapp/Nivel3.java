package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Nivel3 extends AppCompatActivity {
    boolean norway;
    boolean mali;
    boolean cuba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel3);
        norway = false;
        cuba = false;
        mali = false;
    }

    public void onClickNorway(View view){
        norway = true;
        comprobarSolucion();
    }
    public void onClickCorea(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Start Again", Toast.LENGTH_SHORT);
        toast1.show();
        allFalse();
    }
    public void onClickPakis(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Start Again", Toast.LENGTH_SHORT);
        toast1.show();
        allFalse();
    }
    public void onClickMali(View view){
        mali = true;
        comprobarSolucion();
    }
    public void onClickCuba(View view){
        cuba = true;
        comprobarSolucion();
    }
    public void onClickPRico(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Start Again", Toast.LENGTH_SHORT);
        toast1.show();
        allFalse();
    }

    private void comprobarSolucion(){
        if( norway && mali && cuba){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            Toast toast1 = Toast.makeText(getApplicationContext(), "CONGRATULATIONS!! LEVEL 3 PASSED", Toast.LENGTH_SHORT);
            toast1.show();
            allFalse();
        }
    }

    private void allFalse(){
        norway = false;
        mali = false;
        cuba = false;
    }
}
