package basico

fun main() {
    println("Please insert a name.:")
    var name = readLine()
    println("Hello $name")
    println("Insert a number.:")
    val numero0 = readLine()!!.toDouble()
    println("Insert another number.:")
    val numero1 = readLine()!!.toDouble()
    println("Sum result of $numero0 with $numero1 equals ${numero0 + numero1}")

}