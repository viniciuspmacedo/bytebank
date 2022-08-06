open class Conta (var titular:String,
                  val numero:Int) {

    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        } else println("Deposito deve ser maior que zero.")
    }

    open fun saca(valor: Double) {

        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("${this.titular}, você não tem saldo suficiente para esta transação.")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean{
        if (this.saldo >= valor ){
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    open fun saca() {}
}