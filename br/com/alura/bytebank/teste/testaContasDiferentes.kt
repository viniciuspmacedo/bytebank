import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testeContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Gustavo",
            cpf = "444.444.444-44",
            senha = 2222
        ),
        numero = 1004
    )
    contaCorrente.deposita(100.0)
    println("saldo conta corrente após depósito ${contaCorrente.saldo}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Marcos",
            cpf = "555.555.555-55",
            senha = 3333
        ),
        numero = 1004
    )
    contaPoupanca.deposita(150.0)
    println("saldo conta corrente após depósito ${contaPoupanca.saldo}")

    contaCorrente.saca(10.0)
    println("saldo conta corrente após saque ${contaCorrente.saldo}")
    contaPoupanca.saca(10.0)
    println("saldo conta poupança após saque ${contaPoupanca.saldo}")
    contaCorrente.transfere(10.0, contaPoupanca,2222)
    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupança após transferencia ${contaPoupanca.saldo}")
    contaPoupanca.transfere(70.0, contaCorrente, 3333)
    println("saldo conta corrente após transferencia ${contaCorrente.saldo}")
    println("saldo conta poupança após transferencia ${contaPoupanca.saldo}")
}
