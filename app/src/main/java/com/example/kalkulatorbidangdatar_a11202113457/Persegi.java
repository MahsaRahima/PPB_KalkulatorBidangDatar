package com.example.kalkulatorbidangdatar_a11202113457;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Persegi extends AppCompatActivity {


        private EditText sisi;
        private EditText hasil;
        private Button luas;
        private Button keliling;
    @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_persegi);
            sisi = (EditText) findViewById(R.id.sisi);
            hasil = (EditText) findViewById(R.id.hasil);
            luas = (Button) findViewById(R.id.luas);
            keliling = (Button) findViewById(R.id.keliling);
        }

        public void luas_persegi(View view) {
            try {

                int s = Integer.parseInt(sisi.getText().toString());
                double luas =  s * s;
                hasil.setText(String.valueOf(luas));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public void keliling_persegi(View view) {
            try {

                int s = Integer.parseInt(sisi.getText().toString());
                double keliling =  4 * s;
                hasil.setText(String.valueOf(keliling));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        public void kembali1(View view){
            finish();
        }


}