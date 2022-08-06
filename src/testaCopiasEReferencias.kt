fun testaCopiasEReferencias() {
    val contaJoao = Conta("João", 1002)
    println(contaJoao.titular)

    var contaMaria = contaJoao
    //contaMaria.titular = "Maria"
    println("Conta João: ${contaMaria.titular}")
    println("Conta Maria: ${contaJoao.titular}")
}



