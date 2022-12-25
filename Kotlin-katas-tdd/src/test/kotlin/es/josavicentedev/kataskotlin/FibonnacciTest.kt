package es.josavicentedev.kataskotlin

import es.josavicentedev.kataskotlin.es.josavicentedev.kataskotlin.Fibonnacci
import org.testng.Assert.*
import org.testng.annotations.Test

class FibonnacciTest{
    @Test
    fun shouldReturn0If0IsProvided(){
        val fibonnacci = Fibonnacci()
        val result: String = fibonnacci.execute(1)
        assertEquals(result, "0")
    }
    @Test
    fun shouldReturn01If2IsProvided(){
        val fibonnacci = Fibonnacci()
        val result: String = fibonnacci.execute(2)
        assertEquals(result, "0 1")
    }
    @Test
    fun shouldReturn011If3IsProvided(){
        val fibonnacci = Fibonnacci()
        val result: String = fibonnacci.execute(3)
        assertEquals(result, "0 1 1")
    }
}