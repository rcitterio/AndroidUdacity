package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Nivel2 extends AppCompatActivity {
    int resultado;
    EditText p1;
    EditText p2;
    EditText p3;
    EditText p4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2);
        resultado = 0;
    }

    public void onClick(View view) {
        p1 = (EditText) findViewById(R.id.editText6);
        p2 = (EditText) findViewById(R.id.editText7);
        p3 = (EditText) findViewById(R.id.editText8);
        p4 = (EditText) findViewById(R.id.editText);
        calcularRespuesta();
        mostrarResultado();
    }

    private void calcularRespuesta(){
        if(p1.getText().toString().toUpperCase().equals("DUBLIN")){
            resultado += 1;
        }
        if(p2.getText().toString().toUpperCase().equals("SEUL")){
            resultado += 1;
        }
        if(p3.getText().toString().toUpperCase().equals("MEXICO DF")){
            resultado += 1;
        }
        if(p4.getText().toString().toUpperCase().equals("ROME")){
            resultado += 1;
        }
    }

    private void mostrarResultado(){
        if(resultado == 4){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            Toast toast1 = Toast.makeText(getApplicationContext(), "CONGRATULATIONS!! LEVEL 2 PASSED", Toast.LENGTH_SHORT);
            toast1.show();
        }else{
            int fallos = 4 - resultado;
            String fallosString = String.valueOf(fallos);
            Toast toast1 = Toast.makeText(getApplicationContext(), "You have: " + fallosString + " failures", Toast.LENGTH_SHORT);
            toast1.show();
            resultado = 0;
        }
    }
}
