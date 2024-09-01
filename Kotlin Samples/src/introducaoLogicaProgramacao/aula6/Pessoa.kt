package introducaoLogicaProgramacao.aula6

class Pessoa(
    protected var nome: String,
    protected var idade: Int,
    protected var cidade: String,
    protected var altura: Double
) {

    private var amigos: MutableList<String> = mutableListOf()

    fun apresentacao(): String {
        return "Olá, meu nome é $nome e eu moro em $cidade"
    }

    fun podeDirigir(): Boolean{
        return idade >= 18
    }

    fun qualAIdade() : Int {
        return idade
    }

    fun podeAndarNoBancoDaFrente(): Boolean {
        return idade > 10 && altura > 1.45
    }

    fun adicionarAmigo(nomeDoAmigo: String) {
       amigos.add(nomeDoAmigo)
    }

    fun removerAmigo(nomeDoAmigo: String) {
        amigos.remove(nomeDoAmigo)
    }

    fun quantidadeDeAmigos() : Int {
        return amigos.size
    }
}