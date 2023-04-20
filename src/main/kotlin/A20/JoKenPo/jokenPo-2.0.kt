package A20.JoKenPo

import java.util.Scanner

fun main(){
    var jogador1: String
    var jogador2: String
    var scanner = Scanner(System.`in`)

    while (true) {
        println("Bem- vindo ao Joken Po!\n Onde os itens para jogar são:\n pedra, papel e tesoura")
        println("Jogador 1: ")
        jogador1 = scanner.nextLine()

        println("Jogador 2: ")
        jogador2 = scanner.nextLine()

        println(informarNome(jogador1, jogador2))
    }
}

fun informarNome(jogador1: String, jogador2: String):String {
    when {
        jogador1 == jogador2 -> return("Empate")
        jogador1 == "pedra" && jogador2 == "tesoura" -> return ("Jogador 1 venceu")
        jogador1 == "tesoura" && jogador2 == "papel" -> return ("Jogador 1 venceu")
        jogador1 == "papel" && jogador2 == "pedra" -> return ("Jogador 1 venceu")
        else -> return ("Jogador 2 venceu")
    }
}