package org.example.tutorials.collections

fun main() {


    val nameOfAnimal = arrayOf<String>("Dog", "Cat", "Donkey")
    println("List of name animal: $nameOfAnimal")

    println("====== Print of each animal name ===========")
    for (name in nameOfAnimal) {
        print("Name: $name")
    }
}