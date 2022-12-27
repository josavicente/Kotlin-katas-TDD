package es.josavicentedev.kataskotlin

import es.josavicentedev.kataskotlin.es.josavicentedev.kataskotlin.EsPrimo
import org.testng.Assert.*
import org.testng.annotations.Test

class EsPrimoTest{
    @Test
    fun ShouldReturnFalseIfNumberLessThanTwo(){
        val esPrimo = EsPrimo()
        val result : Boolean = esPrimo.checkEsPrimo(1)
        assertEquals(result, false)
    }

    @Test
    fun ShouldReturnTrueIfNumberIsTwo(){
        val esPrimo = EsPrimo()
        val result : Boolean = esPrimo.checkEsPrimo(2)
        assertEquals(result, true)
    }

    @Test
    fun ShouldReturnTrueIfNumberIsFive(){
        val esPrimo = EsPrimo()
        val result : Boolean = esPrimo.checkEsPrimo(5)
        assertEquals(result, true)
    }

    @Test
    fun ShouldReturnFalseIfNumberIsFifteen(){
        val esPrimo = EsPrimo()
        val result : Boolean = esPrimo.checkEsPrimo(15)
        assertEquals(result, false)
    }
}