// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("${usuario.nome} foi matriculado na formação $nome")
        } else {
            println("${usuario.nome} já está matriculado na formação $nome")
        }
    }
    
    fun listarInscritos() {
        println("Lista de inscritos na formação $nome:")
        inscritos.forEach { println(it.nome) }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudo1 = ConteudoEducacional("Kotlin Básico", 90)
    val conteudo2 = ConteudoEducacional("POO em Kotlin", 120)
    val formacaoKotlin = Formacao("Desenvolvimento Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))
    
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bruno")
    
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario1) // Teste de matrícula duplicada
    
    formacaoKotlin.listarInscritos()
}
