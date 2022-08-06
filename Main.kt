import src.*

fun main() {

    println("Bem vindo ao Byte Bank")
    println()

    val contaCorrente = ContaCorrente(titular = "Gustavo", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "André", numero = 1001)

    contaCorrente.deposita(100.0)
    println("saldo conta corrente após depósito ${contaCorrente.saldo}")

    contaPoupanca.deposita(150.0)
    println("saldo conta corrente após depósito ${contaPoupanca.saldo}")
}






