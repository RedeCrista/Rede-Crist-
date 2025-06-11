package com.example.aplicativo

object QuizPontuacao {
    var pontosPedro = 0
    var pontosJoao = 0
    var pontosMateus = 0
    var pontosTome = 0

    fun resetar() {
        pontosPedro = 0
        pontosJoao = 0
        pontosMateus = 0
        pontosTome = 0
    }

    fun getResultado(): String {
        val mapa = mapOf(
            "Pedro" to pontosPedro,
            "João" to pontosJoao,
            "Mateus" to pontosMateus,
            "Tomé" to pontosTome
        )
        return mapa.maxByOrNull { it.value }?.key ?: "Desconhecido"
    }
}
