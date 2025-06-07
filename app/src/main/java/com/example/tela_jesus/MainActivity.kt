package com.example.tela_jesus

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Tela_Jesus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTriste = findViewById<Button>(R.id.btnTriste)
        val btnSobrecarregado = findViewById<Button>(R.id.btnSobrecarregado)
        val btnFeliz = findViewById<Button>(R.id.btnFeliz)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnTriste.setOnClickListener {
            Toast.makeText(this, "Deus está contigo nos momentos difíceis.", Toast.LENGTH_SHORT).show()
        }

        btnSobrecarregado.setOnClickListener {
            Toast.makeText(this, "Confia em mim. Entrega teu fardo.", Toast.LENGTH_SHORT).show()
        }

        btnFeliz.setOnClickListener {
            Toast.makeText(this, "Fico feliz com sua alegria! Que ela permaneça!", Toast.LENGTH_SHORT).show()
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}