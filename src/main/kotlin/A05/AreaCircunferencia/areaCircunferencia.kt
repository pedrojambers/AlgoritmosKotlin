package A05.AreaCircunferencia

import java.util.Scanner

fun main(){
    val raio: Double
    val sc = Scanner(System.`in`)

    println("***Calculo de Area de uma Circunferencia***")
    print("Digite o valor do raio da circunferencia: ")
    raio = sc.nextDouble()

    print("Area da circunferencia: " + (raio*raio)*3.14159265)
}