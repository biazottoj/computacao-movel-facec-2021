package com.biazottoj.parimpar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.num = findViewById(R.id.numero);
        this.t = findViewById(R.id.resultado);
    }

    public void alteraTexto(View v){

        Integer n = Integer.parseInt(this.num.getText().toString());

        String mensagem = "O número é ";

        if (n % 2 == 0){
            mensagem = mensagem + "PAR";
        } else {
            mensagem = mensagem + "IMPAR";
        }

        this.t.setText(mensagem);

    }
}