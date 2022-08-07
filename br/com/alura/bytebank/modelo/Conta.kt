package br.com.alura.bytebank.modelo

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


}