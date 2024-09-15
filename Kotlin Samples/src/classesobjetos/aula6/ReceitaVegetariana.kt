package classesobjetos.aula6

enum class TipoDeReceitaVegetariana(val nome: String){
    MASSA("Massa"),
    SALADA("Salada"),
    DOCE("Doce")
}

class ReceitaVegetariana(
    override val nome: String,
    override val tempoPreparo: Int,
    val tipo: TipoDeReceitaVegetariana
): Receita(nome, tempoPreparo) {

    override fun imprimirReceita() {
        println("Essa é uma receita vegetariana do tipo ${tipo.nome}")
        super.imprimirReceita()
    }
}