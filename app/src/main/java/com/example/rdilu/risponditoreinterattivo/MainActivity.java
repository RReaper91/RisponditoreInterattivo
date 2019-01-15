package com.example.rdilu.risponditoreinterattivo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campo;
    Button mBottone;
    TextView saluto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo = findViewById(R.id.campoNome);
        mBottone = findViewById(R.id.bottone);
        saluto = findViewById(R.id.testoSaluto);

        mBottone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable nome = campo.getText();
                if (nome.length() < 1) {
                    saluto.setText("Ciao Nessuno");
                } else {
                    saluto.setText("Ciao "+nome);
                }
            }
        });
    }
}
