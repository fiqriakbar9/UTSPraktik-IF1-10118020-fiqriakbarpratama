package com.example.utspraktik_if1_10118020_fiqriakbarpratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/*

    Nama : Fiqri Akbar Pratama
    Nim : 10118020
    Kelas : IF1/S1/VI
    Tanggal pengerjaan 05 Juni 2021

 */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nik = (EditText) findViewById(R.id.edtnik);
        final EditText nama = (EditText) findViewById(R.id.edtnama);
        final EditText ttl = (EditText) findViewById(R.id.editTextDate);

        Button btSubmit = (Button) findViewById(R.id.btnselanjutnya);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("data1", nik.getText().toString());
                intent.putExtra("data2", nama.getText().toString());
                intent.putExtra("data3", ttl.getText().toString());
                startActivity(intent);
            }
        });
    }

    public void btnselanjutnya(View view) {
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
        finish();
    }
}