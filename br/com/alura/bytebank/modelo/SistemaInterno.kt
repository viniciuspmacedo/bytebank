package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Sistema Interno do Byte Bank")
            autenticado()
        } else {
            println("Você digitou senha errada.")
        }

    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Sistema Interno do Byte Bank")
            autenticado()
        } else {
            println("Você digitou senha errada.")
        }
    }

    fun pagamento(){
        println("Realizando pagamento")
    }
}