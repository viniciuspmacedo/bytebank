package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaNaAutentcacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    fun transfere(valor: Double, destino: Conta, senha: Int): Boolean {
        if (!autentica(senha)) {
            throw FalhaNaAutentcacaoException()
        }
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        throw SaldoInsuficienteException(
            mensagem = "Saldo Insuficiente. Saldo disponível: $saldo. Valor da transferência: $valor"
        )
    }
}