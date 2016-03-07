package org.example.sillabe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{

    int numeroProve = 20;
    int esatte,errate,prove ;
    String [] sillabePossibili;
    private TextView textEsatte,textErrate, textSillaba;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSillaba = (TextView) findViewById(R.id.textSillaba);
        textErrate = (TextView) findViewById(R.id.textErrate);
        textEsatte = (TextView) findViewById(R.id.textEsatte);

        esatte=errate=0;
        prove=0;
        sillabePossibili= new String[]{};
        sillabePossibili=Fonemi.unisci(sillabePossibili,
                Fonemi.FONEMI_B);
        sillabePossibili=Fonemi.unisci(sillabePossibili,
                Fonemi.FONEMI_C);
        sillabePossibili=Fonemi.unisci(sillabePossibili,
                Fonemi.FONEMI_D);
        sillabePossibili=Fonemi.unisci(sillabePossibili,
                Fonemi.FONEMI_P);
        sillabePossibili=Fonemi.unisci(sillabePossibili,
                Fonemi.FONEMI_M);
        sillabePossibili=Fonemi.unisci(sillabePossibili,
                Fonemi.FONEMI_T);
        //TODO: estrarla dalla configurazione del gioco o livello

        textSillaba.setText(Fonemi.fonemaCasuale(sillabePossibili));



    }


    public void cliccatoBottoneNo(View v)
    {
        errate++;
        textErrate.setText("er."+errate);
    }

    public void cliccatoBottoneSi(View v)
    {
        esatte++;
        textEsatte.setText("es."+esatte);

        textSillaba.setText(Fonemi.fonemaCasuale(sillabePossibili));
        prove++;
        if (prove > numeroProve) finish();
    }
}
