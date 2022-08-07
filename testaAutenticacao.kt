fun testaFuncionarioAdmin() {
    val gerente = Gerente(
        nome = "Clécio",
        cpf = "111.111.111-11",
        salario = 10000.0,
        senha = 1234
    )

    val diretora = Diretor(
        nome = "Josefa",
        cpf = "222.222.222-22",
        salario = 15000.0,
        senha = 5678,
        plr = 1500.0
    )

    val cliente = Cliente(
        nome = "Tobias",
        cpf = "333.444.555-77",
        senha = 1234
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(gerente, 1234)
    sistemaInterno.entra(diretora, 5678)
    //sistemaInterno.entra(cliente, 1234)
}