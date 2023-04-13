package A19.AlgarismosRomanos

fun romanToInt(s: String): Int {
    var result = 0
    var i = 0

    while (i < s.length) {
        val current = getValue(s[i])
        val next = if (i + 1 < s.length) getValue(s[i + 1]) else 0

        if (next > current) {
            result += (next - current)
            i += 2
        } else {
            result += current
            i++
        }
    }

    return result
}

fun getValue(c: Char): Int {
    when (c) {
        'I' -> return 1
        'V' -> return 5
        'X' -> return 10
        'L' -> return 50
        'C' -> return 100
        'D' -> return 500
        'M' -> return 1000
        else -> return 0
    }
}

fun main() {
    val numeralRomano = "XXVII"
    val resultado = romanToInt(numeralRomano)
    println(resultado)
}