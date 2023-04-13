package A20.JoKenPo

fun main() {
    val player1 = "pedra"
    val player2 = "papel"

    when {
        player1 == player2 -> println("Empate")
        player1 == "pedra" && player2 == "tesoura" -> println("Jogador 1 venceu")
        player1 == "tesoura" && player2 == "papel" -> println("Jogador 1 venceu")
        player1 == "papel" && player2 == "pedra" -> println("Jogador 1 venceu")
        else -> println("Jogador 2 venceu")
    }
}