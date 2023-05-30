class Usuario {

    fun dadosUsuario(nome: String, sobrenome: String, idade: Int): String{
        return "Nome: $nome $sobrenome\nIdade: $idade anos"
    }

    val usuario: (String, String, Int) -> String = ::dadosUsuario
}