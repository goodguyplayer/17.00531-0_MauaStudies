package estruturas_controle

fun main() {
    val numero = 16
    if (numero % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }

    // Simular um ternario
    val numero2 = 40
    val resultado = if (numero2 % 2 == 0) "Even" else "Odd"
    println("${resultado}")
}