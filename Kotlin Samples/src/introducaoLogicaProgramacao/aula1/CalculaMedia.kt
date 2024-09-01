package introducaoLogicaProgramacao.aula1

fun main() {
   val notas = listOf(2, 7, 8, 7) // Contém as informação das notas 6, 7, 8, 7

   val quantidadeDeNotas = notas.size // Armazena a quantidade de notas. No exemplo, 4 notas
   val somaDasNotas = notas.sum() // Armazena o somatório das notas. No exemplo,  6 + 7 + 8 + 7 = 28
   val media = somaDasNotas / quantidadeDeNotas // Calcula a média 28 / 4 = 7

   println("A média das notas é $media")

   if (media >= 7){
      println("Aluno aprovado")
   } else {
      println("Aluno reprovado")
   }
}