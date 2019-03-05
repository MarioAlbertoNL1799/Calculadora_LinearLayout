package com.manl.calculadora_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private float numero1;
    private float numero2;
    private float resultado;
    private EditText val_1,val_2,fin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val_1 = findViewById(R.id.eT_1);
        val_2 = findViewById(R.id.eT_2);
        fin = findViewById(R.id.eT_r);
    }
    public void accionSumar(View view){
        numero1 = Float.parseFloat(val_1.getText().toString());
        numero2 = Float.parseFloat(val_2.getText().toString());
        resultado = numero1 + numero2;
        fin.setText(String.valueOf(resultado));
    }
    public void accionRestar(View view){
        numero1 = Float.parseFloat(val_1.getText().toString());
        numero2 = Float.parseFloat(val_2.getText().toString());
        resultado = numero1 - numero2;
        fin.setText(String.valueOf(resultado));
    }
    public void accionMultiplicar(View view){
        numero1 = Float.parseFloat(val_1.getText().toString());
        numero2 = Float.parseFloat(val_2.getText().toString());
        resultado = numero1 * numero2;
        fin.setText(String.valueOf(resultado));
    }
    public void accionDividir(View view){
        numero1 = Float.parseFloat(val_1.getText().toString());
        numero2 = Float.parseFloat(val_2.getText().toString());
        resultado = numero1 / numero2;
        fin.setText(String.valueOf(resultado));
    }
    public void accionModulo(View view){
        numero1 = Float.parseFloat(val_1.getText().toString());
        numero2 = Float.parseFloat(val_2.getText().toString());
        resultado = numero1 % numero2;
        fin.setText(String.valueOf(resultado));
    }
}
