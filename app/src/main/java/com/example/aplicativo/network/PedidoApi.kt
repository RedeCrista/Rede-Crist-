package com.example.aplicativo.network

import com.example.aplicativo.model.Pedido
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface PedidoApi {
    @POST("pedidos")
    fun enviarPedido(@Body pedido: Pedido): Call<String>
}
