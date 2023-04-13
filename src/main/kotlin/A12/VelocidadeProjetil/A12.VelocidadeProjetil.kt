package A12.VelocidadeProjetil


fun main(){

    fun calculoVelocidade(){

        val velocidade : Float
        val metrosPorKm = 1000
        val segundosPorMinutos = 60

        println("Informa a distancia percorrida em quilômetros")
        val distancia = readLine()?.toFloat()!!

        println("Informa o tempo de percurso em minutos")
        val tempo = readLine()?.toFloat()!!

        velocidade = (distancia.times(metrosPorKm)).div(tempo.times(segundosPorMinutos))
        println("A velocidade do projétil é $velocidade metros por segundos")
    }

    calculoVelocidade()
}