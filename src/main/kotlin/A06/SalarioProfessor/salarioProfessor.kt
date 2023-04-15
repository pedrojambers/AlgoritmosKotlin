package A06.SalarioProfessor

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)

    println("***Calculo de Salario***")

    print("Numero de horas trabalhadas no mes: ")
    val hrsTrabalhadas = sc.nextInt()

    print("Valor hora-aula: ")
    val valorHora = sc.nextDouble()

    print("Percentual de desconto do INSS: ")
    val inss = sc.nextDouble()

    val salarioBruto = hrsTrabalhadas * valorHora
    val descontoTotal = salarioBruto * (inss / 100)
    val salarioLiquido = salarioBruto - descontoTotal

    println("Salario bruto: $salarioBruto")
    println("Salario liquido: $salarioLiquido")
}