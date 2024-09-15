package classesobjetos.aula4

fun main() {
    val personagens: Array<Personagem> = arrayOf(
        Lutador(
            nome = "Furioso",
            forca = 200
        ),
        Curador(
            nome = "Restaurador"
        ),
        Magico(
            nome = "Misterioso",
            forca = 90
        )
    )

    for (personagem in personagens){
        println("Eu sou o ${personagem.qualONome()}")

        if (personagem is Lutador){
            println("Minha habilidade é ${personagem.qualAHabilidade().nome}")
        }
    }
}