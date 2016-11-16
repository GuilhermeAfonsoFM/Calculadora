package com.example.aluno.calculadora;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button clickBtnok = (Button) findViewById(R.id.Btnok);
        clickBtnok.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                EditText editTextPnumero = (EditText) findViewById(R.id.Pnumero);
                EditText editTextSnumero = (EditText) findViewById(R.id.Snumero);

                String um = editTextPnumero.getText().toString();
                String dois = editTextSnumero.getText().toString();

                int pn = Integer.parseInt(um);
                int sn = Integer.parseInt(dois);

                int ro = pn + sn;

                String resultado = "O Resultado da soma é " + ro;

                Toast.makeText(getBaseContext(), resultado, Toast.LENGTH_LONG).show();

                return true;
            }
        });
        clickBtnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editTextPnumero = (EditText) findViewById(R.id.Pnumero);
                EditText editTextSnumero = (EditText) findViewById(R.id.Snumero);

                String um = editTextPnumero.getText().toString();
                String dois = editTextSnumero.getText().toString();

                int pn = Integer.parseInt(um);
                int sn = Integer.parseInt(dois);

                int ro = pn / sn;

                String resultado = "O Resultado da divisâo é " + ro;

                Toast.makeText(getBaseContext(), resultado, Toast.LENGTH_LONG).show();


            }
        });
    }
}