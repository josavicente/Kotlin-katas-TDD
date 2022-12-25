package es.josavicentedev.kataskotlin

import FizzBuzz
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class FizzbuzzKtTest {

    @Test
    fun returnTheNumberIfIsNotDivisibleEitherBy3and5() {
        val fizzbuzz = FizzBuzz()
        val fizz: String = fizzbuzz.execute(2)
        assertEquals(fizz, "2")
    }
    @Test
    fun returnFizzIfIsDivisibleOnlyBy3() {
        val fizzbuzz = FizzBuzz()
        val fizz: String = fizzbuzz.execute(3)
        assertEquals(fizz, "fizz")
    }
    @Test
    fun returnBuzzIfIsDivisibleOnlyBy5() {
        val fizzbuzz = FizzBuzz()
        val buzz: String = fizzbuzz.execute(5)
        assertEquals(buzz, "buzz")
    }
    @Test
    fun returnFizzBuzzIfIsDivisibleBy3And5() {
        val fizzbuzz = FizzBuzz()
        val allFizzBuzz: String = fizzbuzz.execute(15)
        assertEquals(allFizzBuzz, "fizzbuzz")
    }
}