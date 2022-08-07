abstract class Conta (var titular:String,
                  val numero:Int) {

    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        } else println("Deposito deve ser maior que zero.")
    }

    abstract fun saca(valor: Double)

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