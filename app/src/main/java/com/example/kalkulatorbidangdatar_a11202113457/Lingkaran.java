package com.example.kalkulatorbidangdatar_a11202113457;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lingkaran extends AppCompatActivity {
    private EditText jari;
    private EditText hasil;
    private Button luas;
    private Button keliling;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        jari = (EditText) findViewById(R.id.jari);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
        keliling = (Button) findViewById(R.id.keliling);
    }

    public void luas_ling(View view) {
        try {

            int r = Integer.parseInt(jari.getText().toString());
            double luas =  Math.PI * r * r;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling_ling(View view) {
        try {

            int r = Integer.parseInt(jari.getText().toString());
            double keliling =  Math.PI * 2 * r;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void kembali3(View view){
        finish();
    }


}