import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val contaJoao = ContaCorrente(
        titular = Cliente(
            nome = "João",
            cpf = "333.333.333-33",
            senha = 1111
        ) , 1002)
    println(contaJoao.titular)

    var contaMaria = contaJoao
    //contaMaria.titular = "Maria"
    println("br.com.alura.bytebank.modelo.Conta João: ${contaMaria.titular.nome}")
    println("br.com.alura.bytebank.modelo.Conta Maria: ${contaJoao.titular.nome}")
}



