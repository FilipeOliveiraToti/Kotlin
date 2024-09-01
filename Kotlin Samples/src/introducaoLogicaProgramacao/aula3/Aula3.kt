package introducaoLogicaProgramacao.aula3

fun main() {
    // Iniciar uma nova loja
    var novaLoja = Loja("Loja do Filipe")

    //Verificar a quantidade de funcionarios
    var quantidadeFuncionarios = novaLoja.quantosFuncionarios()
    println("Inicialmente nós temos $quantidadeFuncionarios")

    //Contratar 3 funcionarios
    novaLoja.contratarUmFuncionario()
    novaLoja.contratarUmFuncionario()
    novaLoja.contratarUmFuncionario()

    //Verificar a quantidade de funcionarios
    quantidadeFuncionarios = novaLoja.quantosFuncionarios()
    println("Depois da contratação nós temos $quantidadeFuncionarios")

    //Demitir 1 funcionário
    novaLoja.demitirUmFuncionario()

    //Verificar a quantidade de funcionarios
    quantidadeFuncionarios = novaLoja.quantosFuncionarios()
    println("Depois da demissão nós temos $quantidadeFuncionarios")

    val objeto1 = Loja("Loja do Filipe")
    val objeto2 = Loja("Loja da Maria")
    val objeto3 = Loja("Loja do João")

    objeto1.contratarUmFuncionario()

    objeto2.contratarUmFuncionario()
    objeto2.contratarUmFuncionario()

    objeto3.contratarUmFuncionario()
    objeto3.contratarUmFuncionario()
    objeto3.contratarUmFuncionario()
}