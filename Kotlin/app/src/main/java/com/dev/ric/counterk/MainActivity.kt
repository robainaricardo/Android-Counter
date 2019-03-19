package com.dev.ric.counterk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Variável contador
    var contador = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicialização do contador
        atualizarContador()

        //Eventos de click

        //evento botão mais
        btnMais.setOnClickListener { incrementarContador() }

        //evento botão menos
        btnMenos.setOnClickListener { decrementarContador() }
    }

    //Funções

    //Método que atualiza o valor do contador
    fun atualizarContador(){
        tvContador.setText("$contador")
    }

    //Método que incrementa e atualiza o valor do contador
    fun incrementarContador(){
        contador++
        atualizarContador()
    }

    //Método que decrementa e atualiza o valor do contador
    fun decrementarContador(){
        if(contador > 0){
            contador--
            atualizarContador()
        }else{
            Toast.makeText(this, "O contador já está zerado", Toast.LENGTH_LONG).show();
        }

    }

}
