package com.example.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View v){

        //R.id.[id do componente]

        EditText n1 = findViewById(R.id.n1);
        EditText n2 = findViewById(R.id.n2);

        Integer numero1 = Integer.parseInt(n1.getText().toString());
        Integer numero2 = Integer.parseInt(n2.getText().toString());


        Integer res = numero1 + numero2;

        TextView resultado = findViewById(R.id.resultado);
        resultado.setText(res.toString());
    }


}