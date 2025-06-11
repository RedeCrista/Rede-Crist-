package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuiztresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiztres)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btn1.setOnClickListener {
            QuizPontuacao.pontosPedro += 1
            abrirResultado()
        }

        btn2.setOnClickListener {
            QuizPontuacao.pontosJoao += 1
            abrirResultado()
        }

        btn3.setOnClickListener {
            QuizPontuacao.pontosMateus += 1
            abrirResultado()
        }

        btn4.setOnClickListener {
            QuizPontuacao.pontosTome += 1
            abrirResultado()
        }

        btnVoltar.setOnClickListener {
            startActivity(Intent(this, QuizdoisActivity::class.java))
            finish()
        }
    }

    private fun abrirResultado() {
        val resultado = QuizPontuacao.getResultado()
        val intent = when (resultado) {
            "Pedro" -> Intent(this, PedroActivity::class.java)
            "João" -> Intent(this, JoaoActivity::class.java)
            "Mateus" -> Intent(this, MateusActivity::class.java)
            "Tomé" -> Intent(this, TomeActivity::class.java)
            else -> Intent(this, Principal::class.java)
        }
        startActivity(intent)
        finish()
    }
}
