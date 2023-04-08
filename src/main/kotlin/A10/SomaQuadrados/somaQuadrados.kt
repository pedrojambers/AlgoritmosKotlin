package A10.SomaQuadrados

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    println("***Soma dos Quadrados***")

    print("Digite o primeiro valor: ")
    val v1 = sc.nextInt()

    print("Digite o segundo valor: ")
    val v2 = sc.nextInt()

    print("Digite o terceiro valor: ")
    val v3 = sc.nextInt()

    val somaQuadrados = (v1 * v1) + (v2 * v2) + (v3 * v3)

    println("A soma dos quadrados dos tres valores e $somaQuadrados")
}