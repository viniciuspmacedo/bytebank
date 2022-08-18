package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel {

    var saldo = 0.0
        protected set

    companion object Contador {
        var totalContas = 0
        private set
    }

    init {
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        } else println("Deposito deve ser maior que zero.")
    }

    abstract fun saca(valor: Double)

    override fun autentica(senha: Int): Boolean {
        return  titular.autentica(senha)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        } else {
            println("${this.titular}, você não tem saldo suficiente para esta transação.")
        }
    }


}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
){
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("${this.titular}, você não tem saldo suficiente para esta transação.")
        }
    }

}

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("${this.titular}, você não tem saldo suficiente para esta transação.")
        }
    }


}