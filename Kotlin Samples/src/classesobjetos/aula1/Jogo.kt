package classesobjetos.aula1

fun main() {
    val lutador = Personagem(
        nome = "Guerreiro do Fogo",
        tipo = "Lutador",
        forca = 10
    )


    println("O lutador tem ${lutador.getVida()} de vida")

    println("O lutador vai receber um ataque de força 5!")

    lutador.receberAtaque(5)

    println("Agora o lutador tem ${lutador.getVida()} de vida")
}