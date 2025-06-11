class QuizLogic {
    private var resposta1: Int = 0
    private var resposta2: Int = 0
    private var resposta3: Int = 0

    fun answerQuestion1(resposta: Int) {
        resposta1 = resposta
    }

    fun answerQuestion2(resposta: Int) {
        resposta2 = resposta
    }

    fun answerQuestion3(resposta: Int) {
        resposta3 = resposta
    }

    fun getResult(): String {
        val soma = resposta1 + resposta2 + resposta3

        return when (soma) {
            in 3..5 -> "Pedro"
            in 6..7 -> "João"
            in 8..9 -> "Tiago"
            else -> "André"
        }
    }
}
