package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(2, 3) {
        println(it)
    }
    somaReceiver(3, 3){
        println(this.toDouble())
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, senha = 1234, autenticado = {
        println("realizar pagamento")
    })
    sistema.entraReceiver(autenticavel, senha = 1234, autenticado = {
        pagamento()
    })
}

fun soma(a:Int, b: Int, resultado: (Int) -> Unit){
    println("executando soma")
    val total = a + b
    resultado(total)
    println("soma executada")
}

fun somaReceiver( a: Int, b: Int, resultado: Int.() -> Unit){
    println("executando soma")
    val total = a + b
    total.run {
        toDouble()
        resultado()
    }

    println("soma executada")
}
