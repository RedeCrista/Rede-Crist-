package com.example.aplicativo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TristeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triste)

        val btnVoltar = findViewById<Button>(R.id.btnVoltarResultado)
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
