package com.example.android.quidditchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.quidditchapp.R;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    int puntuacionGr;
    int puntuacionSl;
    TextView marcadorGr;
    TextView marcadorSl;
    int turnos;
    TextView turnosView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puntuacionGr = 0;
        puntuacionSl = 0;
        marcadorSl = (TextView) findViewById(R.id.marcadorSl);
        marcadorGr = (TextView) findViewById(R.id.marcadorGr);
        turnos = 20;
        turnosView = (TextView) findViewById(R.id.turnos_text_view);
        turnosView.setText(getResources().getString(R.string.turns) + " " + turnos);
    }

    private void actualizarGr() {
        marcadorGr.setText("" +this.puntuacionGr);
        turnos --;
        actualizarTurnos();
        if(turnos == 0){
            terminarPartido();
        }
    }

    private void actualizarSl() {
        marcadorSl.setText("" +this.puntuacionSl);
        turnos--;
        actualizarTurnos();
        if(turnos == 0){
            terminarPartido();
        }
    }

    public void QuaffleGr(View view){
        if(this.turnos <= 0){
            reset(view);
        }else {
            puntuacionGr += 10;
            actualizarGr();
        }
    }

    public void QuaffleSl(View view){
        if(this.turnos <= 0){
            reset(view);
        }else {
            puntuacionSl += 10;
            actualizarSl();
        }
    }


    public void BludgerGr(View view){
        if(this.turnos <= 0){
            reset(view);
        }else {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(3);
            if (numeroAleatorio <= 1) {
                if (puntuacionSl > 0) {
                    puntuacionSl -= 10;
                }
            }
            actualizarSl();
        }
    }

    public void BludgerSl(View view){
        if(this.turnos <= 0){
            reset(view);
        }else {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(3);
            if (numeroAleatorio <= 1) {
                if (puntuacionGr > 0) {
                    puntuacionGr -= 10;
                }
            }
            actualizarGr();
        }
    }

    public void SnitchGr(View view){
        if(this.turnos <= 0){
            reset(view);
        }else{
            Random random = new Random();
            int numeroAleatorio = random.nextInt(9);
            if (numeroAleatorio == 0) {
                ganadorGr();
            }
            turnos--;
            actualizarTurnos();
        }
    }

    public void SnitchSl(View view){
        if(this.turnos <= 0){
            reset(view);
        }else{
            Random random = new Random();
            int numeroAleatorio = random.nextInt(9);
            if (numeroAleatorio == 0) {
                ganadorSl();
            }
            turnos--;
            actualizarTurnos();
        }
    }

    public void ganadorGr(){
        marcadorGr.setText(getResources().getString(R.string.win));
        marcadorSl.setText(getResources().getString(R.string.defeat));
    }

    public void ganadorSl(){
        marcadorGr.setText(getResources().getString(R.string.defeat));
        marcadorSl.setText(getResources().getString(R.string.win));
    }

    private void terminarPartido(){
        if(puntuacionGr > puntuacionSl){
            ganadorGr();
        }else if( puntuacionSl > puntuacionGr){
            ganadorSl();
        }else{
            marcadorSl.setText(getResources().getString(R.string.barra));
            marcadorGr.setText(getResources().getString(R.string.barra));
        }
        //resetear();
    }

    private void actualizarTurnos(){
        turnosView.setText(getResources().getString(R.string.turns) + " " + turnos);
        if(turnos <= 0){
            terminarPartido();
        }
    }

    /*public void resetear(){
        puntuacionGr = 0;
        puntuacionSl = 0;
        actualizarSl();
        actualizarGr();
        turnos = 20;
        actualizarTurnos();
    }
    */
    public void  reset(View view){
        puntuacionGr = 0;
        puntuacionSl = 0;
        actualizarSl();
        actualizarGr();
        turnos = 20;
        actualizarTurnos();
    }
}
