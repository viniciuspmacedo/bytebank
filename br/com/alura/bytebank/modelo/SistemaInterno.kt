package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Sistema Interno do Byte Bank")
        } else {
            println("Você digitou senha errada.")
        }

    }
}