import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco: Endereco? = Endereco(logradouro = "Rua A")
    val enderecoNoNull: Endereco

    println("fora do let ${endereco?.logradouro?.length}")

    endereco?.let {
        println("dentro do let ${it.logradouro.length}")
    }

}



