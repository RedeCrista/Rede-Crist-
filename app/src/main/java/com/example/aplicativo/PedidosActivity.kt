package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PedidosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pedidos_main)

        val btnEnviar = findViewById<Button>(R.id.btnEnviarWhatsapp)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etPedido = findViewById<EditText>(R.id.etPedido)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnEnviar.setOnClickListener {
            val nomeTexto = etNome.text.toString()
            val pedidoTexto = etPedido.text.toString()

            if (nomeTexto.isBlank() || pedidoTexto.isBlank()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // ✅ Linkando com EnviadoActivity
            val intent = Intent(this, EnviadoActivity::class.java)
            startActivity(intent)
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
