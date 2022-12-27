package es.josavicentedev.kataskotlin.es.josavicentedev.kataskotlin
/*
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
class EsPrimo {
    fun checkEsPrimo(number: Int): Boolean {
        if (number < 2) return false
        for (index:Int in 2 until number){
            if(number % index == 0){
                return false
            }
        }
        return true
    }
}