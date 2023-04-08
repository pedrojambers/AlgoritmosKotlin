package A8.ConversaoReal

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    println("***Conversao em Real***")

    print("Valor da cotacao do dolar: ")
    val cotacao = sc.nextDouble()

    print("Quantidade de dolares: ")
    val dolares = sc.nextDouble()

    val conversao = cotacao * dolares

    print("$dolares dolares equivalem a R$ $conversao")
}