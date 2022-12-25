package es.josavicentedev.kataskotlin.es.josavicentedev.kataskotlin

/*
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...

 */

class Fibonnacci(){

    private val zeroPosition = 0
    private val onePosition = 1

    fun execute(position: Int): String {
        var result: String = ""
        var firstValue = zeroPosition
        var secondValue = onePosition
        for (index: Int in 1..position){
            result += if (index == position)  "$firstValue" else "$firstValue "
            val fibonacciValue = firstValue + secondValue
            firstValue = secondValue
            secondValue = fibonacciValue
        }
        return result
    }
}