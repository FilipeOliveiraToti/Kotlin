package classesobjetos.aula5

fun main() {
    val pessoa = PessoaDataClass(
        "Filipe",
        28
    )

    println("Olá, eu sou o ${pessoa.nome} e tenho ${pessoa.idade} anos!")

    pessoa.idade = 29

    println("Olá, eu sou o ${pessoa.nome} e tenho ${pessoa.idade} anos!")
}