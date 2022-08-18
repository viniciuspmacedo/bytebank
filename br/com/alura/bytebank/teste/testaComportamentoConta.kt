import br.com.alura.bytebank.exception.FalhaNaAutentcacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosConta() {
    val contaVinicius = ContaCorrente(
        numero = 1000, titular = Cliente(
            nome = "Vinicius",
            cpf = "111.111.111-11",
            endereco = Endereco(logradouro = "Rua Araras"),
            senha = 1234
        )
    )
    contaVinicius.deposita(80.0)

    val contaTabata = ContaPoupanca(
        titular = Cliente(
            nome = "Tabata",
            cpf = "222.222.222-22",
            endereco = Endereco(logradouro = "Rua Araras"),
            senha = 5678
        ), numero = 1001
    )
    contaTabata.deposita(valor = 350.0)

    println("Titular: ${contaTabata.titular.nome}")
    println("Endereço: ${contaTabata.titular.endereco.logradouro}")
    println("Conta: ${contaTabata.numero}")
    println("Saldo ${contaTabata.saldo}")

    println()

    println("Titular: ${contaVinicius.titular.nome}")
    println("Endereço: ${contaVinicius.titular.endereco.logradouro}")
    println("Conta: ${contaVinicius.numero}")
    println("Saldo ${contaVinicius.saldo}")

    contaTabata.deposita(35.0)
    println("Saldo Conta Tábata após depósito ${contaTabata.saldo}")

    contaVinicius.deposita(350.0)
    println("Saldo Conta Vinicius após depósito ${contaVinicius.saldo}")

    contaTabata.saca(250.0)
    println("Saldo Conta Tábata após saque ${contaTabata.saldo}")
    contaVinicius.saca(200.0)
    println("Saldo Conta Vinicius após saque ${contaVinicius.saldo}")

    println()

    try {
        if (contaTabata.transfere(valor= 20.0, destino = contaVinicius, senha = 578)) {
            println("Transferência realizada com sucesso")
            println()
            println("Saldo Conta Tábata após transferência ${contaTabata.saldo}")
            println("Saldo Conta Vinicius após transferência ${contaVinicius.saldo}")
        }
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println(e.message)
        e.printStackTrace()

    } catch (e: FalhaNaAutentcacaoException){
        println("Falha na transferência")
        println(e.message)
        e.printStackTrace()
    } catch (e: Exception){
        println("Erro Desconhecido")
    }

}