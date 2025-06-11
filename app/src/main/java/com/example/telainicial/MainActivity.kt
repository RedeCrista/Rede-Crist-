package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.buttonNext)

        buttonNext.setOnClickListener {
            val intent = Intent(this, Principal::class.java)
            startActivity(intent)
        }
    }
}
