package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.TesteAutenticacao


fun main(){
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.123-31",
        clienteTipo = ClienteTipo.PF,
        senha = "senha12345"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}