package introducaoLogicaProgramacao.aula5

fun main() {
    val meusPets: Set<String> = setOf(
        "Migo",
        "Estrela",
        "Pingo",
        "Miga"
    )

    for (pet in meusPets){
        println(pet)
    }

    println()

    val migoFazParte = meusPets.contains("Migo")
    if (migoFazParte){
        println("Migo está entre os meus Pets")
    } else {
        println("Migo não está entre os meus Pets")
    }

    val tobFazParte = meusPets.contains("Tob")
    if (tobFazParte){
        println("Tob está entre os meus Pets")
    } else {
        println("Tob não está entre os meus Pets")
    }
}