package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity_nivel4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel4_1);
    }


    public void onClickToronto(View view){
        Intent intent = new Intent(this,Nivel4_2.class);
        startActivity(intent);

    }

    public void onClickFail(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(), "Fail! Try Again", Toast.LENGTH_SHORT);
        toast1.show();
    }
}
