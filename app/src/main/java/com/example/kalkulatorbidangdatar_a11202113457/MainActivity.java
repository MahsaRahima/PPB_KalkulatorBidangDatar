package com.example.kalkulatorbidangdatar_a11202113457;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Button segitiga = (Button) findViewById(R.id.segitiga);

            segitiga.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent segitiga = new Intent(MainActivity.this, Segitiga.class);
                    startActivity(segitiga);
                }
            });
            Button persegi = (Button) findViewById(R.id.persegi);

            persegi.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent persegi = new Intent(MainActivity.this, Persegi.class);
                    startActivity(persegi);
                }
            });
            Button Lingkaran = (Button) findViewById(R.id.lingkaran);

            Lingkaran.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
                    Intent lingkaran = new Intent(MainActivity.this, Lingkaran.class);
                    startActivity(lingkaran);
                }
            });

        }
}