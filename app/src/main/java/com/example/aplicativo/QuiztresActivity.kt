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
            startActivity(Intent(this, PedroActivity::class.java))
            finish()
        }

        btn2.setOnClickListener {
            startActivity(Intent(this, JoaoActivity::class.java))
            finish()
        }

        btn3.setOnClickListener {
            startActivity(Intent(this, MateusActivity::class.java))
            finish()
        }

        btn4.setOnClickListener {
            startActivity(Intent(this, TomeActivity::class.java))
            finish()
        }

        btnVoltar.setOnClickListener {
            startActivity(Intent(this, QuizdoisActivity::class.java))
            finish()
        }
    }
}
