package classesobjetos.aula2

enum class TipoPersonagem(
    val podeCurar: Boolean,
    val podeVoar: Boolean,
    val alturaMaximaPulo: Int,
    val apelido: String
) {
    MAGICO(
        podeCurar = false,
        podeVoar = true,
        alturaMaximaPulo = 6,
        apelido = "Mister Misterioso"
    ),
    LUTADOR(
        podeCurar = false,
        podeVoar = false,
        alturaMaximaPulo = 10,
        apelido = "O Montanha"
    ),
    CURADOR(
        podeCurar = true,
        podeVoar = false,
        alturaMaximaPulo = 4,
        apelido = "O Médico"
    )
}