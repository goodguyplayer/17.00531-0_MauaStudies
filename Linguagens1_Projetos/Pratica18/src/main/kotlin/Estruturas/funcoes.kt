package Estruturas

fun somar(num1:Int, num2:Int) = num1+num2
fun somar2(num1:Int, num2:Int = 6) = num1+num2

fun main() {
    println(somar(5,11))
    println(somar2(6))
}