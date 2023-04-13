package A13.EleicaoSindical

fun main() {
    var votosCandidatoA = 0
    var votosCandidatoB = 0
    var votosCandidatoC = 0
    var votosNulos = 0
    var votosBrancos = 0

    fun leituraVotos() {
        votosCandidatoA = readInt("Informe a quantidade de votos válidos para o candidato A")
        votosCandidatoB = readInt("Informe a quantidade de votos válidos para o candidato B")
        votosCandidatoC = readInt("Informe a quantidade de votos válidos para o candidato C")
        votosNulos = readInt("Informe a quantidade de votos nulos")
        votosBrancos = readInt("Informe a quantidade de votos brancos")
    }

    fun calcularPercentuais() {
        val votosValidos = votosCandidatoA + votosCandidatoB + votosCandidatoC
        val totalEleitores = votosValidos + votosNulos + votosBrancos
        val percentualVotosValidos = (votosValidos.toFloat() / totalEleitores) * 100

        val percentualcandidatoA = (votosCandidatoA.toFloat() / totalEleitores) * 100
        val percentualcandidatoB = (votosCandidatoB.toFloat() / totalEleitores) * 100
        val percentualcandidatoC = (votosCandidatoC.toFloat() / totalEleitores) * 100

        val percentualVotosBrancos = (votosBrancos.toFloat() / totalEleitores) * 100
        val percentualVotosNulos = (votosNulos.toFloat() / totalEleitores) * 100

        println("O total de eleitores foi de $totalEleitores")
        println("O percentual de votos válidos em relação ao total de eleitores foi de $percentualVotosValidos")
        println("O percentual de votos válidos do candidato A em relação a quantidade de eleitores foi de: $percentualcandidatoA")
        println("O percentual de votos válidos do candidato B em relação a quantidade de eleitores foi de: $percentualcandidatoB")
        println("O percentual de votos válidos do candidato C em relação a quantidade de eleitores foi de: $percentualcandidatoC")
        println("O percentual de votos brancos em relação a quantidade de eleitores foi de: $percentualVotosBrancos")
        println("O percentual de votos nulos em relação a quantidade de eleitores foi de: $percentualVotosNulos")
    }

    leituraVotos()
    calcularPercentuais()
}

fun readInt(message: String): Int {
    while (true) {
        print("$message: ")
        val input = readLine()
        try {
            return input?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            println("Valor inválido, tente novamente.")
        }
    }
}
