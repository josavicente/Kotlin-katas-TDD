package es.josavicentedev.kataskotlin

import es.josavicentedev.kataskotlin.es.josavicentedev.kataskotlin.Anagrama

import org.testng.Assert.*
import org.testng.annotations.Test

class AnagramaTest {

    @Test
    fun ShouldReturnFalseIFBothWordsAreTheSame(){
        val anagrama = Anagrama()
        val result : Boolean = anagrama.checkIfAnagrama("ola", "ola")
        assertEquals(result, false)
    }
    @Test
    fun ShouldReturnTrueIFBothWordsOrderedAreTheSame(){
        val anagrama = Anagrama()
        val result : Boolean = anagrama.checkIfAnagrama("ola", "alo")
        assertEquals(result, true)
    }
}