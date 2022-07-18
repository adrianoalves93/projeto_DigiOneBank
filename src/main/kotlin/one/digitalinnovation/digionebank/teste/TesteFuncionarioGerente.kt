package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario
import one.digitalinnovation.digionebank.TesteAutenticacao

fun main (){

    val maria = Gerente("Maria do Carmo", "123456789",5000.0,"senha1236")
        ImprimeRelatorioFuncionario.imprime(maria)

        TesteAutenticacao().autentica(maria)

}
