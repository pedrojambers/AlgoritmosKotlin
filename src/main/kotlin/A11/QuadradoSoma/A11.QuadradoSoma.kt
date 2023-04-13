package A11.QuadradoSoma

fun main() {
    fun receberValores() {
        println("Informe o primeiro valor:")
        val valor1 = readLine()?.toInt() ?: 0

        println("Informe o segundo valor:")
        val valor2 = readLine()?.toInt() ?: 0

        println("Informe o terceiro valor:")
        val valor3 = readLine()?.toInt() ?: 0

        val resultado = listOf(valor1, valor2, valor3)
            .map { it * it }
            .sum()

        println("O resultado da soma dos quadrados dos três valores é $resultado")
    }

    receberValores()
}