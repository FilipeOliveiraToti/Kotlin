package introducaoLogicaProgramacao.aula3

class LojaDeRoupa(
    private val nome: String
): Loja(nome = nome) {

    private var quantidadeDeEstilistas: Int = 0

    override fun lojaPodeSerAberta(): Boolean {
        quantidadeDeFuncionarios
        return quantidadeDeFuncionarios > 0 && quantidadeDeEstilistas > 0
    }
}