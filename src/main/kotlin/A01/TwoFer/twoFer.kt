package A01.TwoFer

import java.lang.System.`in`
import java.util.*

fun main(x: String) {
    var nome:String

    var scanner = Scanner(`in`)

    println("Bem-vindo!")
    println("Infome um nome!")
    nome = scanner.nextLine()

    println(imprimirNome(nome))
}
fun imprimirNome(nome: String) :String{

    if (nome == ""){
        return "Um para você, um para mim"
    }else{
        return "Um para $nome, um para mim"
    }
}