package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

private fun testaWith() {
    with(Endereco()) {
        logradouro = "Avenida Capitão Jose Gallo"
        numero = 100
        bairro = "Centro"
        cidade = "Ribeirão Pires"
        complemento = "Casa"
        cep = "09400-000"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}