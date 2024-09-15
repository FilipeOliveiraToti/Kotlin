package classesobjetos.aula4

enum class Habilidade(val nome: String) {
    ARCO_E_FLECHA("Arco e flecha"),
    LANCA("Lança")
}

class Lutador(
    override val nome: String,
    override val vidaInicial: Int = 100,
    override val forca: Int,
    val habilidade: Habilidade = Habilidade.ARCO_E_FLECHA
) : Personagem(nome, vidaInicial, forca){

    override fun qualONome(): String {
        return "Lutador $nome"
    }

    override fun receberAtaque(forca: Int) {
        pVida = pVida - (forca * 0.8).toInt()
    }

    fun qualAHabilidade(): Habilidade {
        return habilidade
    }

}