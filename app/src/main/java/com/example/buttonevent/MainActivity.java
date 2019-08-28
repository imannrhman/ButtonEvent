package com.example.buttonevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText txtNamaDepan,txtNamaBelakang;
TextView txtOutput;
Button btnTampilkan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNamaDepan = (EditText)findViewById(R.id.txtNamadepan);
        txtNamaBelakang = (EditText)findViewById(R.id.txtNamaBelakang);
        txtOutput = (TextView)findViewById(R.id.txtOutput);
        btnTampilkan = (Button)findViewById(R.id.btnTampil);

        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaDepan = txtNamaDepan.getText().toString();
                String namaBelakang = txtNamaBelakang.getText().toString();
                String output = namaDepan +" "+ namaBelakang;

                txtOutput.setText(output);
            }
        });
    }

}
