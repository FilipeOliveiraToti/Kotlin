package classesobjetos.aula6

data class Ingrediente(val nome: String, val quantidade: String)

open class Receita(open val nome: String, open val tempoPreparo: Int) {
    private val ingredientes = mutableListOf<Ingrediente>()

    fun adicionarIngrediente(nome: String, quantidade: String) {
        val ingrediente = Ingrediente(nome, quantidade)
        ingredientes.add(ingrediente)
    }

    fun listarIngredientes(): List<Ingrediente> {
        return ingredientes
    }

    open fun imprimirReceita() {
        println("Receita: $nome")
        println("Tempo de Preparo: $tempoPreparo minutos")
        println("Ingredientes:")
        for (ingrediente in ingredientes) {
            println("- ${ingrediente.quantidade} de ${ingrediente.nome}")
        }
    }
}