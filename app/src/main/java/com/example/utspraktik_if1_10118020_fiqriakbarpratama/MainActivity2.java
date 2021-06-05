package com.example.utspraktik_if1_10118020_fiqriakbarpratama;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*

    Nama : Fiqri Akbar Pratama
    Nim : 10118020
    Kelas : IF1/S1/VI
    Tanggal pengerjaan 05 Juni 2021

 */

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Dialog dialog;
        Button simpan = findViewById(R.id.simpan);

        TextView tvData1 = (TextView) findViewById(R.id.edtnik);
        TextView tvData2 = (TextView) findViewById(R.id.edtnama);
        TextView tvData3 = (TextView) findViewById(R.id.editTextDate);

        tvData1.setText(getIntent().getStringExtra("data1"));
        tvData2.setText(getIntent().getStringExtra("data2"));
        tvData3.setText(getIntent().getStringExtra("data3"));

        dialog = new Dialog(this);

        //OnClick Button instagram
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.simpan);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
    }
}
