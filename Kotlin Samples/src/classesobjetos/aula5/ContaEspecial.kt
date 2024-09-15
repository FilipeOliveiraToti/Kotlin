package classesobjetos.aula5


class ContaEspecial(name: String) : ContaBancaria(name) {

    override fun saque(valor: Double): Boolean {
        val saldoAposSaque = saldo - valor
        saldo = saldoAposSaque
        return true
    }
}