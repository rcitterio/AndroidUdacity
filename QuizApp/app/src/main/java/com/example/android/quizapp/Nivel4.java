package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class Nivel4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel4);
    }

    public void onClickMadrid(View view){
        Intent intent = new Intent(this,activity_nivel4_1.class);
        startActivity(intent);
        finish();
    }

    public void onClickFail(View view){
        if(Locale.getDefault().getLanguage() == "es") {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fallastes! Prueba otra vez", Toast.LENGTH_SHORT);
            toast1.show();
        }else {
            Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Try Again", Toast.LENGTH_SHORT);
            toast1.show();
        }
    }
}
