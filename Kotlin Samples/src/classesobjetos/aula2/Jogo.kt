package classesobjetos.aula2

fun main() {
    val lutador = Personagem(
        nome = "Guerreiro do Fogo",
        tipo = TipoPersonagem.LUTADOR,
        forca = 10
    )

//    for (tipo in TipoPersonagem.entries) {
//        println("O personagem ${tipo.apelido} tem as características")
//
//        if (tipo.podeVoar) {
//            println("Pode voar!")
//        } else {
//            println("Não pode Voar!")
//        }
//
//        if (tipo.podeCurar) {
//            println("Pode curar!")
//        } else {
//            println("Não pode curar!")
//        }
//
//        println("Pode pular até uma altura de ${tipo.alturaMaximaPulo} metros!")
//        println()
//    }

    when(lutador.getTipo()){
        TipoPersonagem.LUTADOR -> apresentaLutador(lutador.getNome())
        TipoPersonagem.MAGICO -> apresentaMagico(lutador.getNome())
        TipoPersonagem.CURADOR -> apresentaCurador(lutador.getNome())
    }
}

fun apresentaLutador(nome: String) {
    println("Oi! Eu me chamo $nome e sou um personagem do tipo Lutador!")
}

fun apresentaMagico(nome: String) {
    //TODO("Implementar apresentação do Personagem do tipo Mágico")
}

fun apresentaCurador(nome: String) {
    //TODO("Implementar apresentação do Personagem do tipo Curador")
}
