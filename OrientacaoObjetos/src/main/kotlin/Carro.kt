class Carro : Veiculo{

    override fun detalhesVeiculo(cor: String, altura: Double, largura: Double) {
        println("O Carro tem a cor $cor, a altura $altura e a largura $largura")
    }

    override fun primeiraMarcha() {
        println("Passando para a primeira marcha...")
    }

    override fun segundaMarche() {
        println("Passando para a segunda marcha...")
    }

    companion object{
        const val DB = "DB_Fornecedores"
        const val TABLE1 = "Fornecedores"
        const val TABLE2 = "Gerentes"
    }

}