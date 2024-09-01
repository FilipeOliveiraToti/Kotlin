package introducaoLogicaProgramacao.aula2

fun main() {
    val novoLivro = Livro(
        titulo = "Chapeuzinho Vermelho",
        genero = "Infantil",
        anoLancamento = 2000,
        quantidadeDePaginas = 50
    )

    for (i in 1..50){
        novoLivro.lerPagina()
    }

    println()

    if (novoLivro.foiLidoCompletamente()){
        println("Já foi lido completamente")
    } else {
        println("Ainda não foi lido completamente")
    }
}