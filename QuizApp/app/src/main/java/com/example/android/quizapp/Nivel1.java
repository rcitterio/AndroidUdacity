package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Nivel1 extends AppCompatActivity {
    RadioButton respuesta1;
    RadioButton respuesta2;
    RadioButton respuesta3;
    RadioButton respuesta4;
    RadioButton respuesta5;
    RadioButton respuesta6;
    RadioButton respuesta7;
    int puntuacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);
        puntuacion = 0;
    }

    public void onClick(View view){
        respuesta1 = (RadioButton) findViewById(R.id.unotres);
        respuesta2 = (RadioButton) findViewById(R.id.doscuatro);
        respuesta3 = (RadioButton) findViewById(R.id.tresuno);
        respuesta4 = (RadioButton) findViewById(R.id.cuatrocuatro);
        respuesta5 = (RadioButton) findViewById(R.id.cincouno);
        respuesta6 = (RadioButton) findViewById(R.id.seistres);
        respuesta7 = (RadioButton) findViewById(R.id.sietedos);
        puntuacion = 0;
        calcularPuntuacion();
        mostrarResultado();
    }

    private void calcularPuntuacion(){
        int cont = 0;
        if(respuesta1.isChecked()){
            cont += 1;
        }
        if(respuesta2.isChecked()){
            cont += 1;
        }
        if(respuesta3.isChecked()){
            cont += 1;
        }
        if(respuesta4.isChecked()){
            cont += 1;
        }
        if(respuesta5.isChecked()){
            cont += 1;
        }
        if(respuesta6.isChecked()){
            cont += 1;
        }
        if(respuesta7.isChecked()){
            cont += 1;
        }
        puntuacion = cont;
    }

    private void mostrarResultado(){
        if(puntuacion == 7){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            Toast toast1 = Toast.makeText(getApplicationContext(), "CONGRATULATIONS!! LEVEL 1 PASSED", Toast.LENGTH_SHORT);
            toast1.show();
        }else{
            int fallos = 7- puntuacion;
            String fallosString = String.valueOf(fallos);
            Toast toast1 = Toast.makeText(getApplicationContext(), "You have: " + fallosString + " failures", Toast.LENGTH_SHORT);
            toast1.show();
            puntuacion = 0;
        }
    }
}
