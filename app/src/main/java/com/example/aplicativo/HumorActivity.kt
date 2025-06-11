package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HumorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_humor)

        val btnFeliz = findViewById<Button>(R.id.btnFeliz)
        val btnTriste = findViewById<Button>(R.id.btnTriste)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnFeliz.setOnClickListener {
            startActivity(Intent(this, FelizActivity::class.java))
        }

        btnTriste.setOnClickListener {
            startActivity(Intent(this, TristeActivity::class.java))
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
