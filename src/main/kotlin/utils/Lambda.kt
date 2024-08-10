package org.example.utils

data class Lambda(var name: String)


fun main() {
    val lambda = Lambda("Thia");
    val (name) = lambda
    println("name: $name")


    println("Uppercase converter: " + upperCase(name))
}


var upperCase: (String) -> String = { str -> str.uppercase() }