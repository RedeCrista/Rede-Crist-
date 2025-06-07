package com.example.tela_jesus

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela_Jesus3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_jesus3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textResultado = findViewById<TextView>(R.id.textResultado)
        val textVersiculo = findViewById<TextView>(R.id.textVersiculo)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        textResultado.text = "De acordo com seu humor:\nTristeza"
        textVersiculo.text = "Perto está o Senhor dos que têm o coração quebrantado, e salva os contritos de espírito."

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
