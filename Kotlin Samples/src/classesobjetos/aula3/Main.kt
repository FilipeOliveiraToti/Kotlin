package classesobjetos.aula3

fun main() {

    var veiculo: ModoDeTransporte

    veiculo = Bicicleta()

    println("Vamos iniciar os testes!")
    println()
    println("Apresentação do veículo:")
    println("Eu sou o veículo com id ${veiculo.getIdentificador()} e eu tenho ${veiculo.getQuantidadeDeRodas()} rodas!")
    println()

    var velocidadeAtual = 0

    println("Vamos testar a velocidade máxima!")
    while(!veiculo.getChegouNaVelocidadeMaxima()){
        veiculo.acelerar()
        velocidadeAtual = velocidadeAtual + 1
    }

    println("Cheguei na velocidade máxima de $velocidadeAtual km/h")
    println("O som da minha buzina é: ${veiculo.getBuzina()}")
}