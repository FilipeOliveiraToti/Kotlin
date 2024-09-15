package classesobjetos.aula6

fun main() {
    val receitaFavorita = Receita("Brigadeiro", 25)

    receitaFavorita.adicionarIngrediente("Leite Condensado", "1 caixa")
    receitaFavorita.adicionarIngrediente("Manteiga", "1 Colher de Sopa")
    receitaFavorita.adicionarIngrediente("Achocolatado", "4 Colheres de Sopa")

    receitaFavorita.imprimirReceita()

    println()

    val receitaFavoritaVegetariana = ReceitaVegetariana(
        "Brigadeiro Vegetariano",
        25,
        TipoDeReceitaVegetariana.DOCE
    )

    receitaFavoritaVegetariana.adicionarIngrediente("Leite Condensado Vegetariano", "1 caixa")
    receitaFavoritaVegetariana.adicionarIngrediente("Manteiga Vegetariana", "1 Colher de Sopa")
    receitaFavoritaVegetariana.adicionarIngrediente("Achocolatado", "4 Colheres de Sopa")

    receitaFavoritaVegetariana.imprimirReceita()
}