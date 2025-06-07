package com.example.tela_jesus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela_Jesus2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_jesus2)

        val textResultado = findViewById<TextView>(R.id.textResultado)
        val textVersiculo = findViewById<TextView>(R.id.textVersiculo)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        val humor = intent.getStringExtra("HUMOR")

        textResultado.text = "De acordo com seu humor: $humor"

        when (humor) {
            "Triste" -> textVersiculo.text = "O Senhor está perto dos que têm o coração quebrantado. (Salmo 34:18)"
            "Sobrecarregado" -> textVersiculo.text = "Vinde a mim todos os que estais cansados e sobrecarregados... (Mateus 11:28-30)"
            "Feliz" -> textVersiculo.text = "Alegrai-vos sempre no Senhor! (Filipenses 4:4)"
            else -> textVersiculo.text = "Humor não reconhecido."
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}