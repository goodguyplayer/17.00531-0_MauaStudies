package oo

class Animal(val nome:String, var peso:Double){
    override fun toString(): String {
        return "Animal(nome='$nome', peso=$peso)"
    }
}

fun main() {
    val animal1 = Animal("Fido", 12.21)
    val animal2 = Animal("Thor", 42.24)

    println(animal1)
    println(animal2)
}