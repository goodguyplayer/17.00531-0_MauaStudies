package Fundamentos

fun main() {
    var num1 : Double
    var num2 : Int
    var Result : Double

    println("Please input two numbers")
    print("Real number.: ")
    num1 = readLine()!!.toDouble()

    print("Int number.: ")
    num2 = readLine()!!.toInt()

    Result = num1 + num2
    println("Result.: $Result")
    println("Result.: ${num1 + num2}")
    println("Result.: %.3f".format(Result))

}