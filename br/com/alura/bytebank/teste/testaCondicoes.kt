fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("br.com.alura.bytebank.modelo.Conta Positiva")
        saldo == 0.0 -> println("br.com.alura.bytebank.modelo.Conta Neutra")
        else -> println("br.com.alura.bytebank.modelo.Conta Negativa")
    }
}