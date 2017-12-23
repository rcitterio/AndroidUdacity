package com.example.android.quidditchcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int puntuacionGr;
    int puntuacionSl;
    TextView marcadorGr;
    TextView marcadorSl;
    int turnos;
    TextView turnosView;
    String stringTurno = "Turnos: ";

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
        turnosView.setText(stringTurno + " " + turnos);
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
        puntuacionGr += 10;
        actualizarGr();
    }

    public void QuaffleSl(View view){
        puntuacionSl += 10;
        actualizarSl();
    }


    public void BludgerGr(View view){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5);
        if(numeroAleatorio == 0){
            if(puntuacionSl > 0){
                puntuacionSl -= 10;
            }
        }
        actualizarSl();
    }

    public void BludgerSl(View view){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5);
        if(numeroAleatorio == 0){
            if(puntuacionGr > 0){
                puntuacionGr -= 10;
            }
        }
        actualizarGr();
    }

    public void SnitchGr(View view){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(9);
        if(numeroAleatorio == 0){
            ganadorGr();
        }
        turnos--;
        actualizarTurnos();
    }

    public void SnitchSl(View view){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(9);
        if(numeroAleatorio == 0){
            ganadorSl();
        }
        turnos--;
        actualizarTurnos();
    }

    public void ganadorGr(){
        marcadorGr.setText("W");
        marcadorSl.setText("D");
    }

    public void ganadorSl(){
        marcadorGr.setText("D");
        marcadorSl.setText("W");
    }

    private void terminarPartido(){
        if(puntuacionGr > puntuacionSl){
            ganadorGr();
        }else if( puntuacionSl > puntuacionGr){
            ganadorSl();
        }else{
            marcadorSl.setText("-");
            marcadorGr.setText("-");
        }
    }

    private void actualizarTurnos(){
        turnosView.setText(stringTurno + " " + turnos);
    }

    public void  reset(View view){
        puntuacionGr = 0;
        puntuacionSl = 0;
        actualizarSl();
        actualizarGr();
        turnos = 10;
        actualizarTurnos();
    }
}
