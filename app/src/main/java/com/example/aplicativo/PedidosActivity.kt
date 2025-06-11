package com.example.aplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativo.model.Pedido
import com.example.aplicativo.network.ApiService
import com.example.aplicativo.network.PedidoApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PedidosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pedidos_main)

        val btnEnviar = findViewById<Button>(R.id.btnEnviarWhatsapp)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etPedido = findViewById<EditText>(R.id.etPedido)

        btnEnviar.setOnClickListener {
            val nomeTexto = etNome.text.toString()
            val mensagemTexto = etPedido.text.toString()

            if (nomeTexto.isBlank() || mensagemTexto.isBlank()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val novoPedido = Pedido(nome = nomeTexto, mensagem = mensagemTexto)

            val retrofit = ApiService.retrofit.create(PedidoApi::class.java)
            val call = retrofit.enviarPedido(novoPedido)

            call.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    if (response.isSuccessful) {
                        Toast.makeText(this@PedidosActivity, "Pedido enviado com sucesso!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@PedidosActivity, EnviadoActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this@PedidosActivity, "Erro ao enviar o pedido", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Toast.makeText(this@PedidosActivity, "Erro de conexão: ${t.message}", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}
