package introducaoLogicaProgramacao.aula2

//Classe Responsável por armazenar informações sobre uma pessoa
class Pessoa(
   var nome: String,
   var idade: Int,
   var cidade: String,
   var tipoSanguineo: Char,
   var falaIngles: Boolean,
   var falaAlemao: Boolean,
   var altura: Double
)
fun main() {
   // Informações sobre uma pessoa
   val pessoa1 = Pessoa(
      nome = "Filipe",
      idade = 28,
      cidade = "Rio de Janeiro",
      tipoSanguineo = 'A',
      falaIngles = true,
      falaAlemao = false,
      altura = 1.89
   )

   val pessoa2 = Pessoa(
      nome = "Maria",
      idade = 29,
      cidade = "Salvador",
      tipoSanguineo = 'B',
      falaIngles = false,
      falaAlemao = true,
      altura = 1.85
   )

//   println(pessoa1.nome)
//   println(pessoa1.cidade)
//   println(pessoa1.tipoSanguineo)
//   println(pessoa1.falaIngles)
//   println(pessoa1.falaAlemao)
//   println(pessoa1.altura)

//   println()
//
   println(pessoa2.nome)
   println(pessoa2.cidade)
   println(pessoa2.tipoSanguineo)
   println(pessoa2.falaIngles)
   println(pessoa2.falaAlemao)
   println(pessoa2.altura)
}
