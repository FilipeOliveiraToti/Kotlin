package classesobjetos.aula2

class Personagem(
    private val nome: String,
    private val tipo: TipoPersonagem,
    private val vidaInicial: Int = 100, //Valor entre 0 (personagem morreu) ou 100 (vida máxima),
    private val forca: Int
) {

    private var vida = vidaInicial

    fun setVida(vida: Int){
        this.vida = vida
    }

    fun getVida(): Int {
        return vida
    }

    fun receberAtaque(forca: Int){
        vida = vida - forca
    }

    fun getTipo(): TipoPersonagem {
        return tipo
    }

    fun getNome(): String {
        return nome
    }
}