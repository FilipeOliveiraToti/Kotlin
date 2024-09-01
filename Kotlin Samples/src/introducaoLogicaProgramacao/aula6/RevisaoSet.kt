package introducaoLogicaProgramacao.aula6

fun main() {
    val setDeCores : MutableSet<Int> = mutableSetOf(
        1,
        2,
        3,
        1
    )

    for (item in setDeCores){
        println(item)
    }

}