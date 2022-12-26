package es.josavicentedev.kataskotlin.es.josavicentedev.kataskotlin

/*
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

class Anagrama {
    fun checkIfAnagrama(firstWord: String, secondWord: String): Boolean {
        if(firstWord.lowercase()== secondWord.lowercase()) return false
        return firstWord.lowercase().toCharArray().sortedArray().contentEquals(secondWord.lowercase().toCharArray().sortedArray())
    }

}