package com.example.z4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Kalkulator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);
    }
    double l1,l2;
    public void guzikplus(View v) {
        EditText number1 = (EditText)findViewById(R.id.Liczba1);
        EditText number2 = (EditText)findViewById(R.id.Liczba2);
        TextView wynik = (TextView)findViewById(R.id.WynikDzialanie);
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        l1= Double.parseDouble(s1);
        l2= Double.parseDouble(s2);
        double wynik1= l1+l2;
        wynik.setText(Double.toString(wynik1));
        Toast.makeText(Kalkulator.this, "Wykonano dodawanie", Toast.LENGTH_SHORT).show();
    }
    public void guzikminus(View v) {
        EditText number1 = (EditText)findViewById(R.id.Liczba1);
        EditText number2 = (EditText)findViewById(R.id.Liczba2);
        TextView wynik = (TextView)findViewById(R.id.WynikDzialanie);
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        l1= Double.parseDouble(s1);
        l2= Double.parseDouble(s2);
        double wynik1= l1-l2;
        wynik.setText(Double.toString(wynik1));
        Toast.makeText(Kalkulator.this, "Wykonano odejmowanie", Toast.LENGTH_SHORT).show();
    }
    public void guzikrazy(View v) {
        EditText number1 = (EditText)findViewById(R.id.Liczba1);
        EditText number2 = (EditText)findViewById(R.id.Liczba2);
        TextView wynik = (TextView)findViewById(R.id.WynikDzialanie);
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        l1= Double.parseDouble(s1);
        l2= Double.parseDouble(s2);
        double wynik1= l1*l2;
        wynik.setText(Double.toString(wynik1));
        Toast.makeText(Kalkulator.this, "Wykonano mnozenie", Toast.LENGTH_SHORT).show();
    }
    public void guzikdziel(View v) {
        EditText number1 = (EditText) findViewById(R.id.Liczba1);
        EditText number2 = (EditText) findViewById(R.id.Liczba2);
        TextView wynik = (TextView) findViewById(R.id.WynikDzialanie);
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        l1 = Double.parseDouble(s1);
        l2 = Double.parseDouble(s2);
        if (l1 == 0 || l2 == 0) {
            wynik.setText("Nie dziel przez 0");
        } else {
            double wynik1 = l1 / l2;
            Toast.makeText(Kalkulator.this, "Wykonano dzielenie", Toast.LENGTH_SHORT).show();

            wynik.setText(Double.toString(wynik1));
        }
    }


}
