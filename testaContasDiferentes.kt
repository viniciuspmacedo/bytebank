fun testeContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Gustavo", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "André", numero = 1001)

    contaCorrente.deposita(100.0)
    println("saldo conta corrente após depósito ${contaCorrente.saldo}")

    contaPoupanca.deposita(150.0)
    println("saldo conta corrente após depósito ${contaPoupanca.saldo}")

    contaCorrente.saca(10.0)
    println("saldo conta corrente após saque ${contaCorrente.saldo}")
    contaPoupanca.saca(10.0)
    println("saldo conta poupança após saque ${contaPoupanca.saldo}")
    contaCorrente.transfere(10.0, contaPoupanca)
    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupança após transferencia ${contaPoupanca.saldo}")
    contaPoupanca.transfere(70.0, contaCorrente)
    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupança após transferencia ${contaPoupanca.saldo}")
}
