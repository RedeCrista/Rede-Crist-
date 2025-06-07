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

        btnEnviar.setOnClickListener {
            val nome = etNome.text.toString()
            val pedido = etPedido.text.toString()

            if (nome.isBlank() || pedido.isBlank()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val mensagem = "Pedido de oração de $nome:\n$pedido"

            val intentWhatsapp = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, mensagem)
                setPackage("com.whatsapp")
            }

            try {
                startActivity(intentWhatsapp)
            } catch (e: Exception) {
                Toast.makeText(this, "WhatsApp não encontrado", Toast.LENGTH_SHORT).show()
            }

            // Vai para tela de enviado
            val intentEnviado = Intent(this, EnviadoActivity::class.java)
            startActivity(intentEnviado)
            finish()
        }

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, Principal::class.java)
            startActivity(intent)
            finish()
        }
    }
}
