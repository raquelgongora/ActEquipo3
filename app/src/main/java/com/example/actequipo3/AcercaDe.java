package com.example.actequipo3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        //Importamos texto de Act.1
        Bundle bundle = getIntent().getExtras();
        String fraseimportada=bundle.getString("frase");

        String textoPasado = fraseimportada;
        TextView out = (TextView)findViewById(R.id.textoPasado);
        out.setText(textoPasado);

        Button btn2 = (Button) findViewById(R.id.botonact2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent2, 0);

            }
        });
    }
}