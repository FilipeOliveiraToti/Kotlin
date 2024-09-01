package introducaoLogicaProgramacao.aula4

fun main() {
    val convidadosQueChegaram: MutableList<String> = mutableListOf()

    // Adicionar chegada da Aline
    convidadosQueChegaram.add("Aline")
    // Adicionar chegada do Breno
    convidadosQueChegaram.add("Breno")

    // Adicionar chegada da Carol
    convidadosQueChegaram.add("Carol")

    // Adicionar chegada do Filipe
    convidadosQueChegaram.add("Filipe")

    for (nome in convidadosQueChegaram){
        println(nome)
    }
    println()

    // Adicionar saída do Filipe
    convidadosQueChegaram.remove("Filipe")

    println("Lista de convidados atualizada")
    for (nome in convidadosQueChegaram){
        println(nome)
    }
}