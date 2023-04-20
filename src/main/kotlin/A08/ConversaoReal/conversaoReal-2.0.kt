package A08.ConversaoReal

import java.util.Scanner

fun main(){
    var scanner = Scanner(System.`in`)

    println("Bem-vindo")
    println("Informe o valor da cotação do dólar!")
    var cotacao = scanner.nextDouble()

    println("Informe a quantidade dólares(US$) disponível")
    var quantidade = scanner.nextDouble()

    println(cotacao(cotacao, quantidade))
}

fun cotacao(cotacao: Double, quantidade:Double):String{
    var quantidadeReais: Double

    if (cotacao == null)
        return "Cotação não informada"
    if (quantidade == null)
        return "Quantidade não informada"

    quantidadeReais = (quantidade * cotacao)
    return "O valor convertido para reais(R$) é de $quantidadeReais"
}