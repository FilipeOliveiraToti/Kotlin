package introducaoLogicaProgramacao.aula5

class Animal(val nome: String, val idade: Int)

fun main() {
    val animaisNoZoologico: Map<String, String> = mapOf(
        "Elefante" to "Trombinha",
        "Girafa" to "Pescoçuda",
        "Leao" to "Juba de Ouro",
        "Coruja" to "Olhos de Lua",
        "Tartaruga" to "Cascuda"
    )

    for (entrada in animaisNoZoologico){
        println("A espécie do animal é ${entrada.key} e o nome é ${entrada.value}")
    }
    println()

    val idadeDosAnimais: Map<String, Int> = mapOf(
        "Elefante" to 30,
        "Girafa" to 25,
        "Leao" to 29,
        "Coruja" to 15,
        "Tartaruga" to 150
    )

    for (entrada in idadeDosAnimais){
        println("O animal da espécie ${entrada.key} tem ${entrada.value} anos")
    }
    println()

    //Armazenar a informação do nome E da idade de cada espécie
    val animal1 = Animal("Trombinha", 30)
    val animal2 = Animal("Pescoçuda", 25)

    val animaisComNomeEIdade : Map<String, Animal> = mapOf(
        "Elefante" to animal1,
        "Girafa" to animal2
    )

    for (entrada in animaisComNomeEIdade){
        println("O animal da espécie ${entrada.key} se chama ${entrada.value.nome} e tem ${entrada.value.idade} anos")
    }
}