package classesobjetos.aula4

open class Personagem(
    open protected val nome: String,
    open protected val vidaInicial: Int = 100,
    open protected val forca: Int
) {

    protected var pVida = vidaInicial

    open fun atualizaVida(vida: Int){
        this.pVida = vida
    }

    open fun quantoTemDeVida(): Int {
        return pVida
    }

    open fun receberAtaque(forca: Int){
        pVida = pVida - forca
    }

    open fun qualONome(): String {
        return nome
    }
}