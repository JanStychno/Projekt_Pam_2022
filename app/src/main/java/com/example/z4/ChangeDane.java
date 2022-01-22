package com.example.z4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeDane extends AppCompatActivity {
    private EditText changeImie;
    private EditText changeNazwisko;
    private EditText changeKierunek;
    private EditText changeRok;
    private Button buttonZapisz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dane);
        changeImie=findViewById(R.id.edittextImie);
        changeNazwisko=findViewById(R.id.edittextNazwisko);
        changeKierunek=findViewById(R.id.edittextKierunek);
        changeRok=findViewById(R.id.edittextRok);
        buttonZapisz=findViewById(R.id.buttonSave);

        Intent intent=getIntent();
        changeImie.setText(intent.getStringExtra("name"));
        changeNazwisko.setText(intent.getStringExtra("surname"));
        changeKierunek.setText(intent.getStringExtra("field"));
        changeRok.setText(intent.getStringExtra("year"));

        buttonZapisz.setOnClickListener(zapiszListener);

    }
    private View.OnClickListener zapiszListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            zapisz();
        }
    };

    private void zapisz(){
        Intent Save=new Intent();
        Save.putExtra("newname",changeImie.getText().toString());
        Save.putExtra("newsurname",changeNazwisko.getText().toString());
        Save.putExtra("newfield",changeKierunek.getText().toString());
        Save.putExtra("newyear",changeRok.getText().toString());
        setResult(RESULT_OK,Save);
        finish();
    }

}
