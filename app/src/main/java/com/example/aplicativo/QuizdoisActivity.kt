package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizdoisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discipulosdois)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btn1.setOnClickListener {
            QuizPontuacao.pontosPedro += 1
            avancar()
        }

        btn2.setOnClickListener {
            QuizPontuacao.pontosJoao += 1
            avancar()
        }

        btn3.setOnClickListener {
            QuizPontuacao.pontosMateus += 1
            avancar()
        }

        btn4.setOnClickListener {
            QuizPontuacao.pontosTome += 1
            avancar()
        }

        btnVoltar.setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
            finish()
        }
    }

    private fun avancar() {
        val intent = Intent(this, QuiztresActivity::class.java)
        startActivity(intent)
        finish()
    }
}
