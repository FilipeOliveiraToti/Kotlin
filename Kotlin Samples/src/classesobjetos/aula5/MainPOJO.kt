package classesobjetos.aula5

fun main() {
    val pessoa = PessoaPOJO(
        "Filipe",
        28
    )

    println("Olá, eu sou o ${pessoa.qualONome()} e tenho ${pessoa.qualAIdade()} anos!")

    pessoa.atualizaIdade(29)

    println("Olá, eu sou o ${pessoa.qualONome()} e tenho ${pessoa.qualAIdade()} anos!")
}