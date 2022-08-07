fun testeLacos() {
    for (i in 5 downTo 1 step 2) {
        val titular = "Vinicius $i"
        val numeroConta = 1000 + i
        var saldo = i + 0.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

    /**
     * Exemplo de loop For aninhado
     **/

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break
        }
    }
}