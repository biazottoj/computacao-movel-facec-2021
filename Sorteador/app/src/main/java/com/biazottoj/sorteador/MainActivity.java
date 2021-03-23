package com.biazottoj.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText minimo;
    private EditText maximo;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minimo = findViewById(R.id.minimo);
        maximo = findViewById(R.id.maximo);
        resultado = findViewById(R.id.resultado);
    }

    public Integer getRandomNumber(Integer min, Integer max) {
        Double n = ((Math.random() * (max - min)) + min);
        return n.intValue();
    }


    public void sorteia(View v){
        Integer min = Integer.parseInt(minimo.getText().toString());
        Integer max = Integer.parseInt(maximo.getText().toString());

        //String texto = getRandomNumber(min,max).toString();

        resultado.setText(getRandomNumber(min,max).toString());
    }
}