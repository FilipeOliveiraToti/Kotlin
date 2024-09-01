package introducaoLogicaProgramacao.aula2

class LivroDeFotos(
   private var titulo: String,
   private var anoLancamento: Int,
   private var quantidadeDePaginas: Int,
   private var quantidadeDeFotos: Int
) : Livro(titulo, "Fotos", anoLancamento, quantidadeDePaginas) {

   private var fotosVisualizadas = 0

   override fun lerPagina() {
      paginasLidas = paginasLidas + 1
   }

   fun visualizarFoto() {
      fotosVisualizadas = fotosVisualizadas + 1
   }

   override fun foiLidoCompletamente() : Boolean {
      return paginasLidas == quantidadeDePaginas && fotosVisualizadas == quantidadeDeFotos
   }

   fun quantidadeDeFotos(): Int {
      return quantidadeDeFotos
   }
}
