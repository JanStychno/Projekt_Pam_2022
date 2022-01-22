package com.example.z4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button DaneButton;
    private Button KalkulatorButton;
    private Button InfoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaneButton=findViewById(R.id.buttonDane);
        KalkulatorButton=findViewById(R.id.buttonKalkulator);
        InfoButton=findViewById(R.id.buttonInfo);
        DaneButton.setOnClickListener(DaneActivityListener);
        KalkulatorButton.setOnClickListener(KalkulatorActivityListener);
        InfoButton.setOnClickListener(InfoActivityListener);

    }
    private View.OnClickListener DaneActivityListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            OpenDaneActivity();
        }
    };

    private View.OnClickListener KalkulatorActivityListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            OpenKalkulatorActivity();
        }
    };
    private View.OnClickListener InfoActivityListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            OpenInfoActivity();
        }
    };

    public void OpenKalkulatorActivity(){
        Intent openKalk = new Intent(this, com.example.z4.Kalkulator.class);
        this.startActivity(openKalk);
    }
    public void OpenDaneActivity(){
        Intent openDane = new Intent(this, com.example.z4.Dane.class);
        this.startActivity(openDane);
    }
    public void OpenInfoActivity(){
        Intent openInfo = new Intent(this, com.example.z4.Info.class);
        this.startActivity(openInfo);
    }
}