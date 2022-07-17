package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main (){

    val maria = Analista("Maria do Carmo", "123456789",5000.0)
        ImprimeRelatorioFuncionario.imprime(maria)

}
