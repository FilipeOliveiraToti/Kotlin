package classesobjetos.aula4

class Curador(
    override val nome: String,
    override val vidaInicial: Int = 100
) : Personagem(nome, vidaInicial, 0){

    override fun qualONome(): String {
        return "Curador $nome"
    }
}