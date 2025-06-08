package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tome)

        val btnVoltar = findViewById<Button>(R.id.btnVoltarResultado)
        btnVoltar.setOnClickListener {
            startActivity(Intent(this, QuiztresActivity::class.java))
            finish()
        }
    }
}
