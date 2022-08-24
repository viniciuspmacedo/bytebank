package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaScopeFunctions() {
    run {
        println("testando o run")
    }

    Endereco().also {
        println("Endereço antes da inicialização")
        println(it)
    }.apply {
        logradouro = "Rua A"
        numero = 123
        bairro = "Quarta Divisão"
    }.let { endereco ->
        "${endereco.logradouro}, ${endereco.numero} - ${endereco.bairro}".uppercase()
    }.let { endereco: String ->
        println(endereco)
    }

    with(Endereco(logradouro = "Rua B")){
        println(logradouro.uppercase())
    }

//    listOf<Endereco>(Endereco(complemento = "Casa"), Endereco(), Endereco(complemento = "Apartamento"))
//        .filter { endereco ->
//            endereco.complemento.isEmpty()
//        }.let { (println(it)) }
}