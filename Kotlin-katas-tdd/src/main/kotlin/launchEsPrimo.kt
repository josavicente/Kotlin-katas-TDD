import es.josavicentedev.kataskotlin.es.josavicentedev.kataskotlin.EsPrimo

fun main(){
    val esPrimo = EsPrimo()
    (1..100).forEach { index ->
        if(esPrimo.checkEsPrimo(index)) println(index.toString())
    }
}