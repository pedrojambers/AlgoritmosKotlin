package A02.TrocaTroca

import java.util.Scanner

fun main(){
    var A: Int
    var B: Int
    var C: Int
    var D: Int
    var scanner = Scanner(System.`in`)
    println("Bem-vindo")
    println("Informe o primeiro número para A!")
    A = scanner.nextInt()

    println("Informe o segundo número para B!")
    B = scanner.nextInt()

    C = A
    D = B

    A = D
    B = C

    println("Depois da troca de valores ficou:\n A: $A \n B: $B")
}