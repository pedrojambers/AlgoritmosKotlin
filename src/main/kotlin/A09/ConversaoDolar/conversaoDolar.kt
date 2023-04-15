package A09.ConversaoDolar

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    println("***Conversao em Dolar***")

    print("Valor da cotacao do dolar: ")
    val cotacao = sc.nextDouble()

    print("Quantidade de reais: ")
    val reais = sc.nextDouble()

    val conversao = reais / cotacao

    print("R$ $reais equivalem a $conversao dolares")
}