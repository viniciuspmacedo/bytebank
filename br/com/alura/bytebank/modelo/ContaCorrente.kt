package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
), ContaTransferivel {

    override fun saca(valor:Double){
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
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