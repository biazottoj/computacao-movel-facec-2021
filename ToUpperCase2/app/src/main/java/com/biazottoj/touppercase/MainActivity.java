package com.biazottoj.touppercase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mensagem;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagem = findViewById(R.id.mensagem);
        resultado = findViewById(R.id.resultado);
    }

    public void alteraTexto(View v){
        //String texto = mensagem.getText().toString();
        //texto = texto.toUpperCase();
        resultado.setText(mensagem.getText().toString().toUpperCase());
    }
}