package com.example.z4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Dane extends AppCompatActivity {
    private Button buttonChange;
    private TextView Imie;
    private TextView Nazwisko;
    private TextView Kierunek;
    private TextView Rok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.danestatyczne);

        buttonChange = findViewById(R.id.changeButton);
        buttonChange.setOnClickListener(changeActivityListener);
        Imie=findViewById(R.id.edittextImie);
        Nazwisko=findViewById(R.id.edittextNazwisko);
        Kierunek=findViewById(R.id.edittextKierunek);
        Rok=findViewById(R.id.edittextRok);
    }

    private View.OnClickListener changeActivityListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            changeDaneActivity();
        }
    };

    private void changeDaneActivity() {
        Intent intent = new Intent(this, ChangeDane.class);
        intent.putExtra("name", Imie.getText().toString());
        intent.putExtra("surname", Nazwisko.getText().toString());
        intent.putExtra("field", Kierunek.getText().toString());
        intent.putExtra("year", Rok.getText().toString());
        startActivityForResult(intent,2022);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2022){
            Imie.setText(data.getStringExtra("newname"));
            Nazwisko.setText(data.getStringExtra("newsurname"));
            Kierunek.setText(data.getStringExtra("newfield"));
            Rok.setText(data.getStringExtra("newyear"));
            Toast.makeText(Dane.this, "Zapisano zmiany", Toast.LENGTH_LONG).show();
        }
    }

}