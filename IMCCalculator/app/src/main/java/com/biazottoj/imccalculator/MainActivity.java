package com.biazottoj.imccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pesoTextView;
    private TextView alturaTextView;
    private TextView imcTextView;
    private TextView faixaTextView;

    private Double altura = 1.00;
    private Integer peso = 0;

    private final TextWatcher pesoTextViewListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                peso = Integer.parseInt(s.toString());
                pesoTextView.setText(peso.toString() + " kg");
            } catch (Exception e){
                peso = 0;
                pesoTextView.setText("");
            }

            calculaIMC();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private final SeekBar.OnSeekBarChangeListener alturaSeekBarListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            altura = progress/100.00;

            alturaTextView.setText(String.valueOf(progress)+" cm");

            calculaIMC();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pesoTextView = findViewById(R.id.pesoTextView);
        alturaTextView = findViewById(R.id.alturaTextView);
        imcTextView = findViewById(R.id.imcTextView);
        faixaTextView = findViewById(R.id.faixaTextView);

        EditText pesoEditText = findViewById(R.id.pesoEditText);
        pesoEditText.addTextChangedListener(pesoTextViewListener);

        SeekBar alturaSeekBar = findViewById(R.id.alturaSeekBar);
        alturaSeekBar.setOnSeekBarChangeListener(alturaSeekBarListener);

        calculaIMC();

    }

    public String getFaixa(Integer imc){
        if (imc <= 18){
            return "Abaixo do Peso";
        } else if ( imc <= 25) {
            return "Peso Normal";
        } else if (imc <= 30){
            return "Obesidade Grau I";
        } else if (imc <= 35) {
            return "Obsesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }


    public void calculaIMC(){

        Double imc = 0.00;

        if (altura > 0){
            imc =  peso / (altura * altura);
        }

        imcTextView.setText(String.valueOf(imc.intValue()));
        faixaTextView.setText(getFaixa(imc.intValue()));
    }

}