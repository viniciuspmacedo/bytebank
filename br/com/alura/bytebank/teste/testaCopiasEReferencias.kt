import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val contaJoao = ContaCorrente("João", 1002)
    println(contaJoao.titular)

    var contaMaria = contaJoao
    //contaMaria.titular = "Maria"
    println("br.com.alura.bytebank.modelo.Conta João: ${contaMaria.titular}")
    println("br.com.alura.bytebank.modelo.Conta Maria: ${contaJoao.titular}")
}



