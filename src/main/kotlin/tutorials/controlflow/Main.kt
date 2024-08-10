package org.example.tutorials.controlflow

import org.example.nameList

fun main() {

    val animalName = "dogandcat"

    val animal = "?"

    if (animal == "dog") {
        println("Animal is dog")
    } else if (animal == "cat") {
        println("Animal is cat")
    } else {
        println("Any animal!!!")
    }


    fun test(name: String) {
        when (name) {
            "fgfe" -> {
                println()
            }
        }
    }


    for (a in animalName) {
        println(a)
    }
}