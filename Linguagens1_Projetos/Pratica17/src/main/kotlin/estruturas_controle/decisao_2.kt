package estruturas_controle

fun main() {
    // What is this Switch case style?
    println("Write something")
    val valor = readLine()
    when(valor) {
        "Murilo" -> println("Found you")
        "Teste2" -> println("Here 2")
        "lala" -> {
            println("Various commands")
            println("Various commands")
            println("Various commands")
            println("Various commands")
        }
        else -> println("Default value")
    }

    when(valor!!.length){
        in 1..10 -> println("Till 10 digits")
        15 ->  {
            // You can write multiple conds here
            println("Size == 15")
        }
        else -> println("Default value")
    }
}