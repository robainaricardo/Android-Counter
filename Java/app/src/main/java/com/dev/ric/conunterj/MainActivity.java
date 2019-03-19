package com.dev.ric.conunterj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaração dos elementos de UI
    private Button btnMais, btnMenos;
    private TextView tvContador;
    private int valorContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperando referencia para os elementos de UI
        btnMais = (Button) findViewById(R.id.btnMais);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        tvContador = (TextView) findViewById(R.id.tvContador);

        valorContador = 0;

        //Inicialização do contador
        atualizarContador();

        //Evento de click no botão mais
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementarContador();
            }
        });

        //Evento de click no botão menos
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementarContador();
            }
        });

    }

    //Método que atualiza o valor do contador
    private void atualizarContador(){
        tvContador.setText("" + valorContador);
    }

    //Método que incrementa e atualiza o valor do contador
    private void incrementarContador(){
        valorContador++;
        atualizarContador();
    }

    //Método que decrementa e atualiza o valor do contador
    private void decrementarContador(){
        if(valorContador > 0){
            valorContador--;
            atualizarContador();
        }else{
            Toast.makeText(this, "O contador já está zerado!", Toast.LENGTH_SHORT).show();
        }
    }

}