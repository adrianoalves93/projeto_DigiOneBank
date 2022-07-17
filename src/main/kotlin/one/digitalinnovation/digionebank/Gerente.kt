package one.digitalinnovation.digionebank

class Gerente(nome: String,
              cpf: String,
              salario: Double
):Funcionario(nome, cpf, salario) {
    override fun calculadoraAuxilio() = salario * 0.4

}