package A17.Palindromo

fun main() {
    print("Digite uma palavra, frase ou número: ")
    var entrada = readLine()!!.trim().toLowerCase()

    // remover espaços em branco e caracteres especiais
    entrada = entrada.replace("\\s+".toRegex(), "").replace("[^\\w]+".toRegex(), "")

    // verificar se a entrada é um palíndromo
    val palindromo = entrada == entrada.reversed()

    // exibir resultado
    println("Entrada: $entrada")
    if (palindromo) {
        println("É um palíndromo!")
    } else {
        println("Não é um palíndromo.")
    }
}