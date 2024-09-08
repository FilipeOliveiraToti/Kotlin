package classesobjetos.aula1

class Personagem(
    private val nome: String,
    private val tipo: String, //MÁGICO, LUTADOR ou CURADOR,
    private val vidaInicial: Int = 100, //Valor entre 0 (personagem morreu) ou 100 (vida máxima),
    private val forca: Int
) {

//    constructor(
//        nomeEspecial: String,
//        tipoEspecial: String,
//        forcaEspecial: Int
//    ) : this(nome = nomeEspecial, tipo = tipoEspecial, vidaInicial = 100, forca = forcaEspecial)

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
}