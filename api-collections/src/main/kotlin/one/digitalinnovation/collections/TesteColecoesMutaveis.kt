package one.digitalinnovation.collections

fun main() {
    val naruto = Funcionario("Naruto", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("--------- LIST ---------")
    val funcionarios = mutableListOf(naruto, maria)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.remove(naruto)
    funcionarios.forEach { println(it) }

    println("--------- SET ---------")
    val funcionarioSet = mutableSetOf(naruto)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}