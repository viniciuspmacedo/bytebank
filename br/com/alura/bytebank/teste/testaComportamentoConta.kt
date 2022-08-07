import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaVinicius = ContaCorrente(numero = 1000, titular = "Vinicius")
    contaVinicius.deposita(80.0)

    val contaTabata = ContaPoupanca(titular = "Tabata", numero = 1001)
    contaTabata.deposita(valor = 350.0)

    println("Titular: ${contaTabata.titular}")
    println("br.com.alura.bytebank.modelo.Conta: ${contaTabata.numero}")
    println("Saldo ${contaTabata.saldo}")

    println("Titular: ${contaVinicius.titular}")
    println("br.com.alura.bytebank.modelo.Conta: ${contaVinicius.numero}")
    println("Saldo ${contaVinicius.saldo}")

    contaTabata.deposita(35.0)

    contaVinicius.deposita(350.0)

    contaVinicius.saca(200.0)
    contaTabata.saca(250.0)

    if (contaTabata.transfere(100.0, contaVinicius)) {
        println("Transferencia realizada com sucesso")
        println("${contaTabata.saldo}")
        println("${contaVinicius.saldo}")
    } else {
        println("Não foi possivel realizar a tranferencia")
    }
}