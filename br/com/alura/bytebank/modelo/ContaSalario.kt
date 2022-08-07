package br.com.alura.bytebank.modelo

class ContaSalario(
    titular: String,
    numero: Int
): Conta(
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