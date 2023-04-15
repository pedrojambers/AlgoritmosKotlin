package A07.VolumeCaixa

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    println("***Calculo do Volume da Caixa***")

    print("Comprimento: ")
    val comprimento = sc.nextDouble()

    print("Largura: ")
    val largura = sc.nextDouble()

    print("Altura: ")
    val altura = sc.nextDouble()

    val volume = comprimento * (largura * altura)

    print("O volume da caixa é $volume")
}