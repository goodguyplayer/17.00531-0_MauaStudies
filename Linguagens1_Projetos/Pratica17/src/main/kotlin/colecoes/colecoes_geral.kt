package colecoes

fun main() {
    // Array
    val meuVetor = arrayOf(1,2,3)
    var item : Int
    for (item in meuVetor){
        println(item)
    }
    println("Tamanho array.: ${meuVetor.size}")
    println("Primeiro elemento.: ${meuVetor[0]}")
    println("Maior valor.: ${meuVetor.max()}")

    // List
    // Object list non mutable
    val minhaLista = listOf("Hi", "Hello", "Eyo")
    println(minhaLista)

    // mutable list
    val minhaListMutable = mutableListOf("Hi", "Hello", "Eyo")
    println(minhaListMutable)
    minhaListMutable.add("Goku")
    println(minhaListMutable)
}