package classesobjetos.aula4

class Magico(
    override val nome: String,
    override val vidaInicial: Int = 100,
    override val forca: Int
) : Personagem(nome, vidaInicial, forca){

    override fun qualONome(): String {
        return "Mágico $nome"
    }

    override fun atualizaVida(vida: Int) {
        this.pVida = (vida * 1.15).toInt()
    }

}