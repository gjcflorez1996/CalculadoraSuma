package com.example.calculadorasuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private RadioButton rb_suma, rb_resta, rb_multiplicacion, rb_division;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText)findViewById(R.id.txtN1);
        n2 = (EditText) findViewById(R.id.txtN2);
        res = (TextView) findViewById(R.id.tvCalcular);
        rb_suma = (RadioButton) findViewById(R.id.rbSuma);
        rb_resta = (RadioButton) findViewById(R.id.rbResta);
        rb_multiplicacion = (RadioButton) findViewById(R.id.rbMultiplicar);
        rb_division = (RadioButton) findViewById(R.id.rbDividir);

    }
    public void Calcular(View view){
        String num1 = n1.getText().toString();
        String num2 = n2.getText().toString();

        int nm1 = Integer.parseInt(num1);
        int nm2 = Integer.parseInt(num2);
        if(rb_suma.isChecked() == true){
            int suma = nm1 + nm2;
            String resultado = String.valueOf(suma);
            res.setText(resultado);
        }else if(rb_resta.isChecked() == true){
            int resta = nm1 - nm2;
            String resultado = String.valueOf(resta);
            res.setText(resultado);
        }else if(rb_multiplicacion.isChecked() == true){
            int multiplicacion = nm1 * nm2;
            String resultado = String.valueOf(multiplicacion);
            res.setText(resultado);
        }else if(rb_division.isChecked() == true){
            if(nm2 != 0){
                int division = nm1 / nm2;
                String resultado = String.valueOf(division);
                res.setText(resultado);

            }else{
                Toast.makeText(this,"No se puede dividir entre 0",Toast.LENGTH_LONG).show();
            }
        }



    }



}