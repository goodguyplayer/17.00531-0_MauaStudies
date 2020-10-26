package Fundamentos

fun main() {
    print("Please input a name.: ")
    var nome = readLine() ?: "";
    println("Inputted name.: $nome")
    println("Size of name.: ${nome?.length}")
}