package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)

        val btnQuiz = findViewById<Button>(R.id.btnQuiz)
        val btnWhatsapp = findViewById<Button>(R.id.btnWhatsapp)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        val btnHumor = findViewById<Button>(R.id.btnHumor)

        btnQuiz.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        btnWhatsapp.setOnClickListener {
            val intent = Intent(this, PedidosActivity::class.java)
            startActivity(intent)
        }

        btnVoltar.setOnClickListener {
            finish() // Fecha a tela atual e volta para a anterior
        }

        btnHumor.setOnClickListener {
            val intent = Intent(this, PedidosActivity::class.java)
            startActivity(intent)
        }
    }
}
