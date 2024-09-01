package introducaoLogicaProgramacao.aula3

open class Loja(
    private val nome: String
) {

    protected var quantidadeDeFuncionarios: Int = 0

    open fun contratarUmFuncionario() {
        quantidadeDeFuncionarios = quantidadeDeFuncionarios + 1
    }

    open fun demitirUmFuncionario() {
        quantidadeDeFuncionarios = quantidadeDeFuncionarios - 1
    }

    open fun quantosFuncionarios() : Int {
        return quantidadeDeFuncionarios
    }

    open fun lojaPodeSerAberta() : Boolean {
        return quantidadeDeFuncionarios > 0
    }
}