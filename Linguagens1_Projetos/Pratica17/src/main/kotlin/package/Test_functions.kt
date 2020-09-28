package `package`

//Declarar uma funcao
fun SumTwoNumbers(numero1: Int, numero2: Int) : Int{
    return numero1 + numero2
}

// methods of one instruction
fun MultiplyTwoNumbers(numero1: Int, numero2: Int) = numero1*numero2

fun main() {
    println("${SumTwoNumbers(36, 6)}")
    println("${MultiplyTwoNumbers(36, 6)}")
}