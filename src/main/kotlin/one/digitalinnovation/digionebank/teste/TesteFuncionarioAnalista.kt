package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main (){

    val joao = Analista("Joao Pedro", "123456789",2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)

}