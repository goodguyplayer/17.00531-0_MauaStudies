package colecoes

fun main() {
    val meuVetor = arrayOf(1,2,3)
    var item : Int
    for (item in meuVetor){
        println(item)
    }
    println("Tamanho array.: ${meuVetor.size}")
    println("Primeiro elemento.: ${meuVetor[0]}")
    println("Maior valor.: ${meuVetor.max()}")

}