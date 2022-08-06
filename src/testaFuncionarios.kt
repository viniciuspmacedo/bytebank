package src

fun testaFuncionarios() {
    val funcionario1 = Funcionario(
        nome = "Antonio",
        cpf = "123.456.789-10",
        salario = 1000.0,
    )

    println("nome: ${funcionario1.nome}")
    println("cpf: ${funcionario1.cpf}")
    println("salario: ${funcionario1.salario}")
    println("bonificação: ${funcionario1.bonificacao}")

    println()

    val gerente1 = Gerente(
        nome = "Flávia",
        cpf = "222.333.444-00",
        salario = 2000.0,
        senha = 1234
    )

    println("Gerente: ${gerente1.nome}")
    println("CPF: ${gerente1.cpf}")
    println("Salário: ${gerente1.salario}")
    println("Bonificação: ${gerente1.bonificacao}")

    if (gerente1.autentica(1234)) {
        println("Autenticado com sucesso")
    } else println("Falha na autenticação")

    println()

    val diretor1 = Diretor(
        nome = "Tabata",
        salario = 4000.0,
        cpf = "333.444.555.66",
        senha = 5678,
        plr = 400.0
    )
    println("Diretora: ${diretor1.nome}")
    println("CPF: ${diretor1.cpf}")
    println("Salário: ${diretor1.salario}")
    println("Bonificação: ${diretor1.bonificacao}")
    println("PLR: ${diretor1.plr}")

    if (diretor1.autentica(1234)) {
        println("Autenticado com sucesso")
    } else println("Falha na autenticação")

    val analista1 = Analista(
        nome = "Maria",
        cpf = "444.555.666-77",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(diretor1)
    calculadora.registra(gerente1)
    calculadora.registra(funcionario1)
    calculadora.registra(analista1)

    println(calculadora.total)
}