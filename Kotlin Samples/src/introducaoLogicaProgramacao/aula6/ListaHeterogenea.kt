package introducaoLogicaProgramacao.aula6

fun main() {
    var nome: String = "Filipe"
    var idade: Int = 28
    var cidade: String = "Rio de Janeiro"
    var tipoSanguineo: Char = 'A'
    var falaIngles: Boolean = true
    var falaAlemao:Boolean = false
    var altura: Double = 1.89

    //Insira todas as informações acima em uma lista
    val minhaLista = mutableListOf(
        nome,
        idade,
        cidade,
        tipoSanguineo,
        falaIngles,
        falaAlemao,
        altura
    )

    for (item in minhaLista){
        println(item)
    }
}