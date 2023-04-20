package A07.VolumeCaixa

import java.text.DecimalFormat
import java.util.Scanner

fun main(){
    var comprimento: Double
    var largura: Double
    var altura: Double
    var scanner = Scanner(System.`in`)

    println("Bem-vindo")
    println("Informe as medidas da caixa!")
    println("Comprimento:")
    comprimento = scanner.nextDouble()

    println("Largura:")
    largura = scanner.nextDouble()

    println("Altura:")
    altura = scanner.nextDouble()

    println(volumeCaixa(comprimento, largura, altura))
}

fun volumeCaixa(comprimento: Double, largura: Double, altura:Double):Double{
    var volume: Double

    volume = comprimento * largura * altura
    return volume
}