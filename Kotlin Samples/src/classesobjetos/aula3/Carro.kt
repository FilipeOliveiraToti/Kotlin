package classesobjetos.aula3

enum class TipoDeCarro{
    CARRO_GRANDE,
    CARRO_PEQUENO
}

class Carro(
    val tipo: TipoDeCarro
) : ModoDeTransporte {

    private var velocidadeAtual = 0

    override fun getIdentificador(): String {
        when(tipo){
            TipoDeCarro.CARRO_PEQUENO -> {
                return "Carro Pequeno"
            }
            TipoDeCarro.CARRO_GRANDE -> {
                return "Carro Grande"
            }
        }
    }

    override fun getBuzina(): String {
        return "Biii Biii"
    }

    override fun acelerar() {
        velocidadeAtual = velocidadeAtual + 1
    }

    override fun frear() {
        if (velocidadeAtual > 0){
            velocidadeAtual = velocidadeAtual - 1
        } else {
            velocidadeAtual = 0
        }
    }

    override fun getChegouNaVelocidadeMaxima(): Boolean {
        when(tipo){
            TipoDeCarro.CARRO_PEQUENO -> {
                return velocidadeAtual == 100
            }
            TipoDeCarro.CARRO_GRANDE -> {
                return velocidadeAtual == 130
            }
        }
    }

    override fun getQuantidadeDeRodas(): Int {
        return 4
    }
}