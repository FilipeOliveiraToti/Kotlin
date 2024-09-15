package classesobjetos.aula5

class PessoaPOJO(
    private val nome: String,
    private val idade: Int
) {

    private var pNome = nome
    private var pIdade = idade

    fun qualONome(): String {
        return pNome
    }

    fun qualAIdade() : Int {
        return pIdade
    }

    fun atualizaNome(nome: String){
        this.pNome = nome
    }

    fun atualizaIdade(idade: Int){
        this.pIdade = idade
    }
}