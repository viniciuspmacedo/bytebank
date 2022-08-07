package br.com.alura.bytebank.modelo

interface ContaTransferivel {

    fun transfere (valor: Double, destino: Conta): Boolean
}