package introducaoLogicaProgramacao.aula4

fun main() {
    val chamadaDaTurmaA: Array<String> = arrayOf(
        "Aline",
        "Bruno",
        "Carol",
        "Diego",
        "Eliana",
        "Filipe"
    )

    // Imprimir o nome do primeiro aluno
    println(chamadaDaTurmaA[0])
    println()

    // Imprimir o nome de todos os alunos
    for(nome in chamadaDaTurmaA){
        println(nome)
    }
    println()

    // Juntar as turmas A e B
    val chamadaTurmaB : Array<String> = arrayOf(
        "Amanda",
        "Breno",
        "Camila",
        "Diogo"
    )

    // Imprimir todos os alunos da nova turma formada por A + B
    val novaTurma = chamadaDaTurmaA + chamadaTurmaB

    println("Nova turma")
    println()
    for (nome in novaTurma){
        println(nome)
    }
}