package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
), ContaTransferivel {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("${this.titular}, você não tem saldo suficiente para esta transação.")
        }
    }

    override fun transfere(valor: Double, destino: Conta):Boolean {
        if (this.saldo >= valor ){
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}