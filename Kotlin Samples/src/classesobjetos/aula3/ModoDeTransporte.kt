package classesobjetos.aula3

interface ModoDeTransporte {

    abstract fun getIdentificador() : String

    abstract fun getBuzina(): String

    abstract fun acelerar()

    abstract fun frear()

    abstract fun getChegouNaVelocidadeMaxima() : Boolean

    abstract fun getQuantidadeDeRodas() : Int
}