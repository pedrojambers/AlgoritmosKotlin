package A3.AjusteSalarial

import java.util.*

fun main(){
    val salario: Double
    val percentual: Double
    val novoSalario: Double
    val sc = Scanner(System.`in`)

    println("***Ajuste Salarial***")
    print("Digite o salario mensal: ")
    salario = sc.nextDouble()

    print("Digite o percentual de reajuste: ")
    percentual = sc.nextDouble()

    novoSalario = salario * (1 + percentual/100)

    println("O novo salario sera: R$ ${"%.2f".format(novoSalario)}")
}