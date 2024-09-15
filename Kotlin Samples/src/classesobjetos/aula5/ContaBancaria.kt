package classesobjetos.aula5

import kotlin.math.roundToInt

open class ContaBancaria(
    name: String
) {

    protected var saldo: Double = 0.0
    private val nomeDoCliente: String = name
    val numeroDaConta: Int = (Math.random() % 1000).roundToInt()

    fun qualONumeroDaConta() : Int {
        return numeroDaConta
    }

    fun deposito(valor: Double){
        saldo = saldo + valor
    }

    open fun saque(valor: Double): Boolean {
        val saldoAposSaque = saldo - valor
        if (saldoAposSaque >= 0){
            saldo = saldoAposSaque
            return true
        } else {
            return false
        }
    }

    fun qualONomeDoCliente(senhaDeAcesso: String): String{
        if (senhaDeAcesso == "123") {
            return nomeDoCliente
        } else {
            return ""
        }
    }
}