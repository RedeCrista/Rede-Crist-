package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quizdiscipulos)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        val avancar = {
            val intent = Intent(this, QuizdoisActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn1.setOnClickListener { avancar() }
        btn2.setOnClickListener { avancar() }
        btn3.setOnClickListener { avancar() }
        btn4.setOnClickListener { avancar() }

        btnVoltar.setOnClickListener {
            val intent = Intent(this, Principal::class.java)
            startActivity(intent)
            finish()
        }
    }
}
