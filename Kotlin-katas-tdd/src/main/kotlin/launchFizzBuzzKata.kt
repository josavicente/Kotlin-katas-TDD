package es.josavicentedev.kataskotlin

import FizzBuzz

fun main(){
    launchFizzbuzz(10)
}

fun launchFizzbuzz(iterations: Int) {
    val fizzBuzz = FizzBuzz()
    for(index: Int in 1..iterations){
        println(fizzBuzz.execute(index))
    }
}
