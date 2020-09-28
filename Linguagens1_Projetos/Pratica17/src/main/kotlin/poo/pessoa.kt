package poo

// Parametros do constructor
// Can use ' = "" ' as "Can be empty
class Pessoa(nome: String, cpf: String = "", email: String = ""){

    // Atributos da classe
    val nome : String
    val cpf : String
    val email : String

    // Constructor body
    init {
        this.nome = nome
        this.cpf = cpf
        this.email = email
    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', cpf='$cpf', email='$email')"
    }


}