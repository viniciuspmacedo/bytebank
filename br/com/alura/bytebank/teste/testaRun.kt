package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa Mensal: $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Vincius", cpf = "111.111.111-11", senha = 1234), numero = 1000)
    contaPoupanca.run {
        deposita(1000.0)
        println(saldo)
        val rendimendoMensal = saldo * taxaMensal
        println("Rendimento mensal = $rendimendoMensal")
    }
    run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += (saldo * taxaMensal)
        }
        println("Simulação de rendimento para 12 meses: $saldo")
    }
}