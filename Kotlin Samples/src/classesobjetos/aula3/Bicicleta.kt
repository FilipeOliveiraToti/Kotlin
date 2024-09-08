package classesobjetos.aula3

class Bicicleta : ModoDeTransporte {

    private var velocidadeAtual = 0

    override fun getIdentificador(): String {
        return "Bicicleta"
    }

    override fun getBuzina(): String {
        return "Plim Plim"
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
        return velocidadeAtual == 30
    }

    override fun getQuantidadeDeRodas(): Int {
        return 2
    }
}