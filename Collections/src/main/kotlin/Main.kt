fun main(args: Array<String>) {

    println("\nList")

    val listaFilmes1 = listOf<String>("Harry Potter", "Maze Runner", "Percy Jackson")
    println(listaFilmes1)

    println("\nArray List")

    var listaFilmes2 = arrayListOf<String>("Harry Potter", "Maze Runner", "Percy Jackson")
    println(listaFilmes2)

    listaFilmes2.add("Homem Aranha")
    println(listaFilmes2)

    listaFilmes2.remove("Percy Jackson")
    println(listaFilmes2)

    listaFilmes2[2] = "A Saga Crepusculo"
    println(listaFilmes2)

    println("\nMutable List")

    var listaFilmes3 = mutableListOf<String>("Harry Potter", "Maze Runner", "Percy Jackson")
    println(listaFilmes3)

    // Adicionar
    listaFilmes3.add("Homem Aranha")
    println(listaFilmes3)

    // Remover
    listaFilmes3.remove("Percy Jackson")
    println(listaFilmes3)

    // Atualizar
    listaFilmes3[2] = "A Saga Crepusculo"
    println(listaFilmes3)

    println("\n---------------------------------------")
    println("\nFilter")

    val listaFilmes: MutableList<Filme> = mutableListOf(
        Filme("Harry Potter 1", "Harry Potter e a Pedra Filosofal", 2001),
        Filme("Harry Potter 2", "Harry Potter e a Camara Secreta", 2002),
        Filme("Harry Potter 3", "Harry Potter e o Prisioneiro de Askaban", 2004),
        Filme("Harry Potter 4", "Harry Potter e o Calice de Fogo", 2005),
        Filme("Harry Potter 5", "Harry Potter e a Ordem da Fenix", 2007),
        Filme("Harry Potter 6", "Harry Potter e o Enigma do Principe", 2009),
        Filme("Harry Potter 7", "Harry Potter e as Reliquias da Morte - Parte 1", 2010),
        Filme("Harry Potter 8", "Harry Potter e as Reliquias da Morte - Parte 2", 2011),
    )

    println(listaFilmes.filter{
        it.ano!! < 2009
    })

    println("\n---------------------------------------")
    println("\nSort")

    val listaNumeros = mutableListOf(
        0, 2, 1, 3, 5, 4, 6, 8, 7, 10, 9
    )
    listaNumeros.sort()
    println(listaNumeros)

    println("\n---------------------------------------")
    println("\nSort Descending")

    val listaLetras = mutableListOf(
        "B", "A", "C", "D", "F", "E", "H", "G"
    )
    listaLetras.sortDescending()
    println(listaLetras)

    println("\n---------------------------------------")
    println("\nHash Map")

    val usuarioMap = hashMapOf(
        "nome" to "Raquel",
        "sobrenome" to "Stefany",
        "idade" to 20,
    )

    val nome = usuarioMap.get("nome")
    println(nome)

    println("\n---------------------------------------")
    println("\nLet")

    val listaFilmesL: MutableList<Filme> = mutableListOf(
        Filme("Maze Runner 1", "Maze Runner - Correr ou Morrer", 2014),
        Filme("Maze Runner 2", "Maze Runner - Prova de Fogo", 2015),
        Filme("Maze Runner 3", "Maze Runner - A Cura Mortal", 2018)
    )

    listaFilmesL.let { lista ->
        val filmeMap = hashMapOf(
            "lista" to lista
        )

        println(filmeMap.get("lista"))
    }
}