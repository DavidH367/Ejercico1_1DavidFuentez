package com.example.calculadora11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numeroUno, numeroDos;
    Button btnSuma, btnResta, btnMulti, btnDivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        numeroUno = (EditText) findViewById(R.id.numeroUno);
        numeroDos = (EditText) findViewById(R.id.numeroDos);
        btnSuma =  (Button) findViewById(R.id.btnSuma);
        btnResta =  (Button) findViewById(R.id.btnResta);
        btnMulti =  (Button) findViewById(R.id.btnMultiplicacion);
        btnDivi =  (Button) findViewById(R.id.btnDivision);

        //crear evento cuando haga clic
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "El resultado de la Suma es:  " +Suma(Integer.parseInt(numeroUno.getText().toString()), Integer.parseInt(numeroDos.getText().toString()  +"") )   , Toast.LENGTH_LONG).show();
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "El resultado de la Resta es:  " +Resta(Integer.parseInt(numeroUno.getText().toString()), Integer.parseInt(numeroDos.getText().toString()  +"") )   , Toast.LENGTH_LONG).show();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "El resultado de la Multiplicacion es:  " +Multiplicacion(Integer.parseInt(numeroUno.getText().toString()), Integer.parseInt(numeroDos.getText().toString()  +"") )   , Toast.LENGTH_LONG).show();
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "El resultado de la Suma es:  " +Division(Double.parseDouble(numeroUno.getText().toString()), Double.parseDouble(numeroDos.getText().toString()  +"") )   , Toast.LENGTH_LONG).show();
            }
        });


    }

    public int Suma(int numUno, int numDos){
        return numUno + numDos;

    }

    public int Resta(int numUno, int numDos){
        return numUno - numDos;

    }

    public int Multiplicacion(int numUno, int numDos){
        return numUno * numDos;

    }

    public Double Division(Double numUno, Double numDos){

        return numUno / numDos;

    }


}