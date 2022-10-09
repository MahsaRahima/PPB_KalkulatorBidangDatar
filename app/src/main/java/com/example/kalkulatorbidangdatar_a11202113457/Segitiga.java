package com.example.kalkulatorbidangdatar_a11202113457;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {

    private EditText nilaia;
    private EditText nilait;
    private EditText nilaib;
    private EditText nilaic;
    private EditText hasil;
    private Button Luas;
    private Button Keliling;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        nilaia = (EditText) findViewById(R.id.nilaia);
        nilait = (EditText) findViewById(R.id.nilait);
        nilaib = (EditText)findViewById(R.id.nilaib);
        nilaic = (EditText) findViewById(R.id.nilaic) ;
        hasil = (EditText) findViewById(R.id.hasil);
        Luas = (Button) findViewById(R.id.luas);
        Keliling = (Button) findViewById(R.id.keliling);

    }

    public void luas_segitiga(View view) {
        try {

            int a = Integer.parseInt(nilaia.getText().toString());
            int t = Integer.parseInt(nilait.getText().toString());
            int luas = (a * t) / 2;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling_segitiga(View view) {
        try {

            int a = Integer.parseInt(nilaia.getText().toString());
            int b = Integer.parseInt(nilaib.getText().toString());
            int c = Integer.parseInt(nilaic.getText().toString());
            int keliling = a+b+c;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali2(View view){
        finish();
    }

}