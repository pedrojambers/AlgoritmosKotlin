package A16.OrdenandoInteiros

fun main() {
    // leitura dos elementos
    val numeros = IntArray(12)

    for (i in 0 until numeros.size) {
        print("Digite o ${i+1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    // ordenação em ordem decrescente
    numeros.sortDescending()

    // exibição dos elementos ordenados
    println("Elementos em ordem decrescente:")
    for (numero in numeros) {
        print("$numero ")
    }
}