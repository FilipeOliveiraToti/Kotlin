package introducaoLogicaProgramacao.aula2

open class Livro(
   private var titulo: String,
   private var genero: String,
   private var anoLancamento: Int,
   private var quantidadeDePaginas: Int
) {

   protected var paginasLidas = 0

   open fun lerPagina() {
      paginasLidas = paginasLidas + 1
   }

   open fun foiLidoCompletamente() : Boolean {
      return paginasLidas == quantidadeDePaginas
   }
}
