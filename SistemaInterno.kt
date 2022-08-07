class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("${admin.nome}, bem vindo ao Sistema Interno do Byte Bank")
        } else {
            println("${admin.nome}, você digitou senha errada.")
        }

    }
}