import java.util.Arrays

lateinit var usuario: Usuario

fun main(args: Array<String>){
   /* val carro = Carro()
    carro.detalhesVeiculo("Azul", 1.55, 1.85)
    carro.primeiraMarcha()
    carro.segundaMarche()*/

    println(Carro.DB)
    println(Carro.TABLE1)
    println(Carro.TABLE2)

    usuario = Usuario()

    println(usuario.teste())
}