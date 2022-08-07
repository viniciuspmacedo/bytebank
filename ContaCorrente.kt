import Conta
class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor:Double){
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        } else {
            println("${this.titular}, você não tem saldo suficiente para esta transação.")
        }
    }
}