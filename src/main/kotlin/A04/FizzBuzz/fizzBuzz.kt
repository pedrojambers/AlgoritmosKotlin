package A04.FizzBuzz

fun main(args: Array<String>){
    var primeiroNumero: Int
    var segundoNumero: Int

    do {
        println("Informe o 1° número: ")
        primeiroNumero = readLine()?.toIntOrNull()!!

        if (primeiroNumero == null)
            println("Informe apenas números!")
    } while (primeiroNumero == null)

    do {
        println("Informe o 2° número: ")
        segundoNumero = readLine()?.toIntOrNull()!!

        if (segundoNumero == null)
            println("Informe apenas números!")
    } while (segundoNumero == null)

    println(fizzBuzz(primeiroNumero, segundoNumero))
}
fun fizzBuzz(primeiroNumero: Int, segundoNumero: Int): String{
    var intervalo = ""

    for (i in primeiroNumero..segundoNumero) {
        if (i % 3 == 0 && i % 5 == 0) intervalo += "FizzBuzz"
        else if (i % 3 == 0) intervalo += "Fizz"
        else if (i % 5 == 0) intervalo += "Buzz"
        else intervalo += "${i}"

        if (i < segundoNumero)
            intervalo += ", "
    }

    return intervalo
}